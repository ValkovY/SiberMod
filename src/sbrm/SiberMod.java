package sbrm;

import arc.Core;
import arc.Events;
import arc.func.Func;
import arc.scene.ui.ImageButton;
import arc.scene.ui.layout.Table;
import arc.util.Log;
import mindustry.game.EventType.ClientLoadEvent;
import mindustry.game.EventType.FileTreeInitEvent;
import mindustry.gen.Icon;
import mindustry.mod.Mod;
import mindustry.mod.Mods.LoadedMod;
import sbrm.content.*;

import java.util.Random;

import static arc.Core.*;
import static mindustry.Vars.*;

public class MarsiumMod extends Mod {

	@Override
	public void loadContent() {
		SBRMItems.load();
		SBRMPlanets.load();
		SBRMTechTree.load();
		SBRMSectorPresets.load();
		SBRMWeathers.load();
		SBRMBlocks.load();
	}
}
