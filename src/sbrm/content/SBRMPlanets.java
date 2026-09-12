package sbrm.content;

import arc.graphics.Color;
import mindustry.content.Planets;
import mindustry.game.SectorPreset;
import mindustry.gen.PlanetGenerator;
import mindustry.world.meta.Attribute;
import sbrm.SiberMod;

public class SBRMPlanets {
    public static final PlanetGenerator<SBRMSectorPresets.SiberSector> siberiaGenerator = new PlanetGenerator<SBRMSectorPresets.SiberSector>() {{
        defaultRadius = 0.4f;
        orbitRadius = 35f;
        orbitOffset = 90f;
        rotateSpeed = 0.2f;
        startSector = "siber-boss-arena";
        
        // Visual settings
        sectorColors.put("siber-boss-arena", Color.valueOf("8B4513"));
        atmosphereColor = Color.valueOf("4A5D7F");
        atmosphereRadIn = 0.15f;
        atmosphereRadOut = 0.35f;
        landCloudColor = Color.valueOf("6B7F9F");
        waterColor = Color.valueOf("2E4A6B");
        iceColor = Color.valueOf("A8C8D8");
        
        // Sector colors for the planet surface
        sectorColors.put("siber-boss-arena", Color.valueOf("8B4513"));
        
        attributes.set(Attribute.water, 0.3f);
        attributes.set(Attribute.oil, 0.2f);
        attributes.set(Attribute.coal, 0.4f);
    }};

    public static void load() {
        // Siberia - custom planet with boss arena sector
        siberiaGenerator.generate();
    }
}
