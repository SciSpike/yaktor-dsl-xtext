package io.yaktor.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.nodemodel.INode;

public class ConversationValueConverters extends Ecore2XtextTerminalConverters {
	private static final Date doInternalToValue(String string, INode node)
			throws ValueConverterException {
		StringBuilder format = new StringBuilder("yyyy-MM-dd");
		TimeZone z = TimeZone.getTimeZone("UTC");
		if (string.indexOf('T') > 0) {
			format.append("'T'HH:mm:ss");
			if (string.indexOf('.') > 0) {
				format.append(".SSS");
			}
			if (string.endsWith("Z")) {
				format.append("'Z'");
			} else {
				String tz = string.substring(19);
				string = string.substring(0, 19);
				z = TimeZone.getTimeZone("GMT" + tz);
			}
		}
		SimpleDateFormat fmt = new SimpleDateFormat(format.toString());
		fmt.setTimeZone(z);
		try {
			return fmt.parse(string);
		} catch (ParseException e) {
			throw new ValueConverterException("Invalid DateFormat", node, e);
		}
	}

	private static final String doInternalToString(Date date, boolean time){
		StringBuilder format = new StringBuilder("yyyy-MM-dd");
		TimeZone z = TimeZone.getTimeZone("UTC");
		if (time) {
			format.append("'T'HH:mm:ss");
			format.append(".SSS");
			format.append("'Z'");
		}
		SimpleDateFormat fmt = new SimpleDateFormat(format.toString());
		fmt.setTimeZone(z);
		return fmt.format(date);
	}

	@ValueConverter(rule = "DATETIME")
	public IValueConverter<Date> DateTimeValue() {
		return new AbstractNullSafeConverter<Date>() {
			@Override
			protected Date internalToValue(String string, INode node)
					throws ValueConverterException {
				return doInternalToValue(string, node);
			}

			@Override
			protected String internalToString(Date value) {
				return doInternalToString(value, false);
			}
		};

	}

	@ValueConverter(rule = "DATE")
	public IValueConverter<Date> DateValue() {
		return new AbstractNullSafeConverter<Date>() {
			@Override
			protected Date internalToValue(String string, INode node)
					throws ValueConverterException {
				return doInternalToValue(string, node);
			}

			@Override
			protected String internalToString(Date value) {
				return doInternalToString(value, false);
			}
		};

	}
}
