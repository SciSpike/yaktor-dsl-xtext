package io.yaktor.validation;

public interface IssueCodes {

	String PREFIX = "io.yaktor.";

	String MISSING_STATE = PREFIX + "MissingState";
	String MISSING_AGENT = PREFIX + "MissingAgent";
	String MISSING_PUB = PREFIX + "MissingPub";
	String MISSING_SUB = PREFIX + "MissingSub";
	String EVENT_LOOP = PREFIX + "EventLoop";
	String INVALID_STATE_MODEL = PREFIX + "InvalidStateModel";
	String MISSING_END = PREFIX + "MissingEnd";
	String MISSING_PROJECTION = PREFIX + "MissingProjection";

}
