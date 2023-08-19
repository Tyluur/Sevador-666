package com.sevador.game.event.npc;

import com.sevador.game.event.EventManager;
import com.sevador.game.event.NPCActionEvent;
import com.sevador.game.node.npc.NPC;
import com.sevador.game.node.player.Player;
import com.sevador.utility.OptionType;

/**
 * @author <b>Tyluur</b><tyluur@zandium.org> - <code>Wrote the class</code>
 */
public class RoddeckEvent implements NPCActionEvent {

	@Override
	public boolean init() {
		return EventManager.register(8863, this);
	}

	@Override
	public boolean handle(Player p, NPC npc, OptionType option) {
		p.getDialogueManager().startDialogue("Roddeck", new Object[]{npc.getId()});
		return true;
	}

}
