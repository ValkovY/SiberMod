package sbrm.content;

import arc.graphics.Color;
import mindustry.game.SectorPreset;
import mindustry.world.Sector;
import sbrm.SiberMod;

public class SBRMSectorPresets {
    
    // Custom sector preset for the boss arena
    public static final SectorPreset siberBossArena = new SectorPreset("siber-boss-arena", SBRMPlanets.siberiaGenerator, 1) {{
        alwaysUnlocked = true;
        difficulty = 7;
        captureWave = 25;
        overrideLaunchDefaults = true;
        
        // Starting resources
        addStartingUnit(0, 0);
        
        // Visual appearance on planet map
        color = Color.valueOf("8B4513");
    }};

    public static void load() {
        // Register sector presets
        SiberMod.log("Loaded SiberMod sector presets");
    }
    
    // Custom sector class if needed for special behavior
    public static class SiberSector extends Sector {
        public SiberSector(SectorPreset preset) {
            super(preset);
        }
    }
}
