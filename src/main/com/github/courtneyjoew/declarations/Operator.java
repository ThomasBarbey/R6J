package main.com.github.courtneyjoew.declarations;

public enum Operator {
    SMOKE("Smoke", "def", "2:1", "poisongaskill", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-smoke.874e9888.png"),
    MUTE("Mute", "def", "3:1", "gadgetjammed", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-mute.3e4f2b01.png"),
    SLEDGE("Sledge", "atk", "4:1", "hammerhole", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-sledge.00141f92.png"),
    THATCHER("Thatcher", "atk", "5:1", "gadgetdestroywithemp", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-thatcher.b1cac8e7.png"),

    CASTLE("Castle", "def", "2:2", "kevlarbarricadedeployed", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-castle.378f8f4e.png"),
    ASH("Ash", "atk", "3:2", "bonfirewallbreached", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-ash.16913d82.png"),
    PULSE("Pulse", "def", "4:2", "heartbeatspot", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-pulse.9de627c5.png"),
    THERMITE("Thermite", "atk", "5:2", "reinforcementbreached", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-thermite.9010fa33.png"),

    DOC("Doc", "def", "2:3", "teammaterevive", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-doc.29fe751b.png"),
    ROOK("Rook", "def", "3:3", "armortakenteammate", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-rook.eb954a4e.png"),
    TWITCH("Twitch", "atk", "4:3", "gadgetdestroybyshockdrone", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-twitch.83cbfa97.png"),
    MONTAGNE("Montagne", "atk", "5:3", "shieldblockdamage", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-montagne.2078ee84.png"),

    GLAZ("Glaz", "atk", "2:4", "sniperkill", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-glaz.43dd3bdf.png"),
    FUZE("Fuze", "atk", "3:4", "clusterchargekill", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-fuze.9e7e9222.png"),
    KAPKAN("Kapkan", "def", "4:4", "boobytrapkill", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-kapkan.562d0701.png"),
    TACHANKA("Tachanka", "def", "5:4", "turretkill", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-tachanka.ae7943f0.png"),

    BLITZ("Blitz", "atk", "2:5", "flashedenemy", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-blitz.cd45df08.png"),
    IQ("IQ", "atk", "3:5", "gadgetspotbyef", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-iq.b1acee1a.png"),
    JAGER("Jäger", "def", "4:5", "gadgetdestroybycatcher", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-jager.600b2773.png"),
    BANDIT("Bandit", "def", "5:5", "batterykill", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-bandit.385144d9.png"),

    BUCK("Buck", "atk", "2:6", "buck_kill", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-buck.2fc3e097.png"),
    FROST("Frost", "def", "3:6", "frost_dbno", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-frost.e5362220.png"),

    BLACKBEARD("Blackbeard", "atk", "2:7", "gunshieldblockdamage", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-blackbeard.fccd7e2c.png"),
    VALKYRIE("Valkyrie", "def", "3:7", "camdeployed", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-valkyrie.f87cb6bd.png"),

    CAPITAO("Capitão", "atk", "2:8", "lethaldartkills", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-capitao.6603e417.png"),
    CAVEIRA("Caveira", "def", "3:8", "interrogations", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-caveira.757e9259.png"),

    HIBANA("Hibana", "atk", "2:9", "detonate_projectile", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-hibana.c2a8477d.png"),
    ECHO("Echo", "def", "3:9", "enemy_sonicburst_affected", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-echo.a77c7d7e.png"),

    JACKAL("Jackal", "atk", "2:A", "cazador_assist_kill", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-jackal.0326ca29.png"),
    MIRA("Mira", "def", "3:A", "black_mirror_gadget_deployed", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-mira.22fb72a5.png"),

    YING("Ying", "atk", "2:B", "dazzler_gadget_detonate", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-ying.b88be612.png"),
    LESION("Lesion", "def", "3:B", "caltrop_enemy_affected", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-lesion.07c3d352.png"),

    ELA("Ela", "def", "2:C", "concussionmine_detonate", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-ela.63ec2d26.png"),
    ZOFIA("Zofia", "atk", "3:C", "concussiongrenade_detonate", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-zofia.2a892bf5.png"),

    VIGIL("Vigil", "def", "2:D", "attackerdrone_diminishedrealitymode", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-vigil.4db5385b.png"),
    DOKKAEBI("Dokkaebi", "atk", "3:D", "phoneshacked", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-dokkaebi.2f83a34f.png"),

    LION("Lion", "atk", "3:E", "tagger_tagdevice_spot", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-lion.69637075.png"),
    FINKA("Finka", "atk", "4:E", "rush_adrenalinerush", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-finka.71d3a243.png"),

    MAESTRO("Maestro", "def", "2:F", "killswithturret", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-maestro.b6cf7905.png"),
    ALIBI("Alibi", "def", "3:F", "revealedattackers", "https://ubistatic-a.akamaihd.net/0058/prod/assets/images/badge-alibi.7fba8d33.png");

    private String id;
    private String displayName;
    private String category;
    private String index;
    private String gadget;
    private String badgeUrl;

    Operator(String displayName, String category, String index, String gadget, String badgeUrl) {
        this.id = name().toLowerCase();
        this.displayName = displayName;
        this.category = category;
        this.index = index;
        this.gadget = gadget;
        this.badgeUrl = badgeUrl;
    }


    public String getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getCategory() {
        return category;
    }

    public String getIndex() {
        return index;
    }

    public String getGadget() {
        return gadget;
    }

    public String getBadgeUrl() {
        return badgeUrl;
    }

    public String getGadgetStatisticQuery() {
        return "operatorpvp_" + id + "_" + gadget + ":" + index; //operatorpvp_smoke_poisongaskill:2:1
    }

    public String getStatisticName(String statistic) {
        return "operatorpvp_" + statistic + ":" + index + ":infinite";
    }
}
