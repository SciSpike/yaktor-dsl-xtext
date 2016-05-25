/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package io.yaktor.ui.linking;

import io.yaktor.conversation.State
import io.yaktor.validation.IssueCodes
import org.eclipse.xtext.diagnostics.DiagnosticMessage
import org.eclipse.xtext.diagnostics.Severity
import org.eclipse.xtext.linking.impl.LinkingDiagnosticMessageProvider
import org.eclipse.xtext.linking.ILinkingDiagnosticMessageProvider.ILinkingDiagnosticContext
import io.yaktor.conversation.Agent
import io.yaktor.conversation.SubscribableByMe
import io.yaktor.conversation.PublishableByMe

/**
 * @author Jan Koehnlein initial contribution and API
 */
public class ConversationLinkingDiagnosticMessageProvider extends LinkingDiagnosticMessageProvider {

  override DiagnosticMessage getUnresolvedProxyMessage(ILinkingDiagnosticContext context) {
    var reference = context.reference.EType.instanceClass
    switch reference {
      case State:
        new DiagnosticMessage("Missing "+ reference.simpleName + " " + context.getLinkText(), Severity.ERROR,
          IssueCodes.MISSING_STATE, context.getLinkText(),reference.simpleName)
      case SubscribableByMe:
        new DiagnosticMessage("Missing "+ reference.simpleName + " "  + context.getLinkText(), Severity.ERROR,
          IssueCodes.MISSING_SUB, context.getLinkText(),reference.simpleName)
      case PublishableByMe:
        new DiagnosticMessage("Missing "+ reference.simpleName + " "  + context.getLinkText(), Severity.ERROR,
          IssueCodes.MISSING_PUB, context.getLinkText(),reference.simpleName)
      case Agent:
        new DiagnosticMessage("Missing "+ reference.simpleName + " "  + context.getLinkText(), Severity.ERROR,
          IssueCodes.MISSING_AGENT, context.getLinkText(),reference.simpleName)
      default:
        super.getUnresolvedProxyMessage(context)
    }
  }
}
