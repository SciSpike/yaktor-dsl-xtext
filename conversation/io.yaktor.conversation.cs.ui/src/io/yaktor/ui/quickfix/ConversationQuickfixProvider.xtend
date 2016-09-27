package io.yaktor.ui.quickfix

import io.yaktor.conversation.ConversationFactory
import io.yaktor.conversation.State
import io.yaktor.conversation.StateMachine
import io.yaktor.validation.IssueCodes
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue

import static extension io.yaktor.ui.Utils.*
import io.yaktor.conversation.Agent
import io.yaktor.conversation.Conversation

/**
 * Custom quickfixes.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#quickfixes
 */
class ConversationQuickfixProvider extends DefaultQuickfixProvider {

  @Fix(IssueCodes.MISSING_STATE)
  def void createState(Issue issue, IssueResolutionAcceptor acceptor) {
    acceptor.accept(issue, "Create " + issue.data.get(1) + " " + issue.data.get(0),
      "Create the state to make it valid",
      // providing null for the icon name makes Eclipse use the
      // standard quick fix icon
      null,
      [ element, context |
        var sm = element.findStateMachine;
        var State state = ConversationFactory.eINSTANCE.createState;
        state.setName(issue.data.get(0));
        sm.states.add(0, state);
      ])
  }
  @Fix(IssueCodes.MISSING_AGENT)
  def void createAgent(Issue issue, IssueResolutionAcceptor acceptor) {
    acceptor.accept(issue, "Create " + issue.data.get(1) + " " + issue.data.get(0),
      "Create the agent to make it valid",
      // providing null for the icon name makes Eclipse use the
      // standard quick fix icon
      null,
      [ element, context |
        var c = element.eResource.allContents.head as Conversation;
        var Agent agent = ConversationFactory.eINSTANCE.createAgent;
        agent.setName(issue.data.get(0));
        agent.setStateMachine(ConversationFactory.eINSTANCE.createStateMachine);
        c.agents.add(0,agent);
      ])
  }

  @Fix(IssueCodes.MISSING_PUB)
  def void createPub(Issue issue, IssueResolutionAcceptor acceptor) {
    acceptor.accept(issue, "Create " + issue.data.get(1) + " " + issue.data.get(0),
      "Create a new Event that is " + issue.data.get(1),
      // providing null for the icon name makes Eclipse use the
      // standard quick fix icon
      null,
      [ element, context |
        var agent = element.findAgent;
        var event = ConversationFactory.eINSTANCE.createPubliclySubscribable;
        event.setName(issue.data.get(0));
        agent.sendables.add(event);
      ])
  }

  def StateMachine findStateMachine(EObject o) {
    if (o instanceof StateMachine) {
      o;
    } else if (o.eContainer != null) {
      o.eContainer.findStateMachine
    } else {
      null
    }
  }
}
