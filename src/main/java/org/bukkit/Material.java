/*     */ package org.bukkit;
/*     */ 
/*     */ import com.google.common.collect.Maps;
/*     */ import java.lang.reflect.Constructor;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.util.Map;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import org.apache.commons.lang.Validate;
/*     */ import org.bukkit.material.Bed;
/*     */ import org.bukkit.material.Button;
/*     */ import org.bukkit.material.Cake;
/*     */ import org.bukkit.material.Cauldron;
/*     */ import org.bukkit.material.Coal;
/*     */ import org.bukkit.material.Crops;
/*     */ import org.bukkit.material.DetectorRail;
/*     */ import org.bukkit.material.Diode;
/*     */ import org.bukkit.material.Dispenser;
/*     */ import org.bukkit.material.Door;
/*     */ import org.bukkit.material.Dye;
/*     */ import org.bukkit.material.Furnace;
/*     */ import org.bukkit.material.Gate;
/*     */ import org.bukkit.material.Ladder;
/*     */ import org.bukkit.material.Lever;
/*     */ import org.bukkit.material.LongGrass;
/*     */ import org.bukkit.material.MaterialData;
/*     */ import org.bukkit.material.MonsterEggs;
/*     */ import org.bukkit.material.Mushroom;
/*     */ import org.bukkit.material.PistonBaseMaterial;
/*     */ import org.bukkit.material.PistonExtensionMaterial;
/*     */ import org.bukkit.material.PoweredRail;
/*     */ import org.bukkit.material.PressurePlate;
/*     */ import org.bukkit.material.Pumpkin;
/*     */ import org.bukkit.material.Rails;
/*     */ import org.bukkit.material.RedstoneTorch;
/*     */ import org.bukkit.material.RedstoneWire;
/*     */ import org.bukkit.material.Sandstone;
/*     */ import org.bukkit.material.Sign;
/*     */ import org.bukkit.material.SmoothBrick;
/*     */ import org.bukkit.material.SpawnEgg;
/*     */ import org.bukkit.material.Stairs;
/*     */ import org.bukkit.material.Step;
/*     */ import org.bukkit.material.Torch;
/*     */ import org.bukkit.material.TrapDoor;
/*     */ import org.bukkit.material.Tree;
/*     */ import org.bukkit.material.Vine;
/*     */ import org.bukkit.material.Wool;
/*     */ import org.bukkit.util.Java15Compat;
/*     */ 
/*     */ public enum Material
/*     */ {
    	     TAPIS_BLANC(140),
        	TAPIS_NOIR(141),
        	TAPIS_GRIS_FONCE(142),
        	TAPIS_ROUGE(143),
         	TAPIS_ROSE(144),
	        TAPIS_VERT(145),
	        TAPIS_VERT_CLAIR(146),
	        TAPIS_MARRON(147),
	        TAPIS_JAUNE(148),
	        TAPIS_BLEU(149),
	        TAPIS_BLEU_CLAIR(150),
	        TAPIS_VIOLET(151),
	        TAPIS_MAGENTA(152),
	        TAPIS_CYAN(153),
	        TAPIS_ORANGE(154),
	        TAPIS_GRIS_CLAIR(155),
	        RED_STAIRS(125),
	        ROSE_STAIRS(126),
	        BLACK_STAIRS(127),
	        DARKGREY_STAIRS(128),
	        DARKGREEN_STAIRS(129),
	        GREEN_STAIRS(130),
	        BROWN_STAIRS(131),
	        YELLOW_STAIRS(132),
	        DARKBLUE_STAIRS(133),
	        BLUE_STAIRS(134),
	        DARKVIOLET_STAIRS(135),
	        VIOLET_STAIRS(136),
	        CYAN_STAIRS(137),
	        ORANGE_STAIRS(138),
	        GREY_STAIRS(139),
/*  21 */   AIR(0), 
/*  22 */   STONE(1), 
/*  23 */   GRASS(2), 
/*  24 */   DIRT(3), 
/*  25 */   COBBLESTONE(4), 
/*  26 */   WOOD(5, Tree.class), 
/*  27 */   SAPLING(6, Tree.class), 
/*  28 */   BEDROCK(7), 
/*  29 */   WATER(8, MaterialData.class), 
/*  30 */   STATIONARY_WATER(9, MaterialData.class), 
/*  31 */   LAVA(10, MaterialData.class), 
/*  32 */   STATIONARY_LAVA(11, MaterialData.class), 
/*  33 */   SAND(12), 
/*  34 */   GRAVEL(13), 
/*  35 */   GOLD_ORE(14), 
/*  36 */   IRON_ORE(15), 
/*  37 */   COAL_ORE(16), 
/*  38 */   LOG(17, Tree.class), 
/*  39 */   LEAVES(18, Tree.class), 
/*  40 */   SPONGE(19), 
/*  41 */   GLASS(20), 
/*  42 */   LAPIS_ORE(21), 
/*  43 */   LAPIS_BLOCK(22), 
/*  44 */   DISPENSER(23, Dispenser.class), 
/*  45 */   SANDSTONE(24, Sandstone.class), 
/*  46 */   NOTE_BLOCK(25), 
/*  47 */   BED_BLOCK(26, Bed.class), 
/*  48 */   POWERED_RAIL(27, PoweredRail.class), 
/*  49 */   DETECTOR_RAIL(28, DetectorRail.class), 
/*  50 */   PISTON_STICKY_BASE(29, PistonBaseMaterial.class), 
/*  51 */   WEB(30), 
/*  52 */   LONG_GRASS(31, LongGrass.class), 
/*  53 */   DEAD_BUSH(32), 
/*  54 */   PISTON_BASE(33, PistonBaseMaterial.class), 
/*  55 */   PISTON_EXTENSION(34, PistonExtensionMaterial.class), 
/*  56 */   WOOL(35, Wool.class), 
/*  57 */   PISTON_MOVING_PIECE(36), 
/*  58 */   YELLOW_FLOWER(37), 
/*  59 */   RED_ROSE(38), 
/*  60 */   BROWN_MUSHROOM(39), 
/*  61 */   RED_MUSHROOM(40), 
/*  62 */   GOLD_BLOCK(41), 
/*  63 */   IRON_BLOCK(42), 
/*  64 */   DOUBLE_STEP(43, Step.class), 
/*  65 */   STEP(44, Step.class), 
/*  66 */   BRICK(45), 
/*  67 */   TNT(46), 
/*  68 */   BOOKSHELF(47), 
/*  69 */   MOSSY_COBBLESTONE(48), 
/*  70 */   OBSIDIAN(49), 
/*  71 */   TORCH(50, Torch.class), 
/*  72 */   FIRE(51), 
/*  73 */   MOB_SPAWNER(52), 
/*  74 */   WOOD_STAIRS(53, Stairs.class), 
/*  75 */   CHEST(54), 
/*  76 */   REDSTONE_WIRE(55, RedstoneWire.class), 
/*  77 */   DIAMOND_ORE(56), 
/*  78 */   DIAMOND_BLOCK(57), 
/*  79 */   WORKBENCH(58), 
/*  80 */   CROPS(59, Crops.class), 
/*  81 */   SOIL(60, MaterialData.class), 
/*  82 */   FURNACE(61, Furnace.class), 
/*  83 */   BURNING_FURNACE(62, Furnace.class), 
/*  84 */   SIGN_POST(63, 64, Sign.class), 
/*  85 */   WOODEN_DOOR(64, Door.class), 
/*  86 */   LADDER(65, Ladder.class), 
/*  87 */   RAILS(66, Rails.class), 
/*  88 */   COBBLESTONE_STAIRS(67, Stairs.class), 
/*  89 */   WALL_SIGN(68, 64, Sign.class), 
/*  90 */   LEVER(69, Lever.class), 
/*  91 */   STONE_PLATE(70, PressurePlate.class), 
/*  92 */   IRON_DOOR_BLOCK(71, Door.class), 
/*  93 */   WOOD_PLATE(72, PressurePlate.class), 
/*  94 */   REDSTONE_ORE(73), 
/*  95 */   GLOWING_REDSTONE_ORE(74), 
/*  96 */   REDSTONE_TORCH_OFF(75, RedstoneTorch.class), 
/*  97 */   REDSTONE_TORCH_ON(76, RedstoneTorch.class), 
/*  98 */   STONE_BUTTON(77, Button.class), 
/*  99 */   SNOW(78), 
/* 100 */   ICE(79), 
/* 101 */   SNOW_BLOCK(80), 
/* 102 */   CACTUS(81, MaterialData.class), 
/* 103 */   CLAY(82), 
/* 104 */   SUGAR_CANE_BLOCK(83, MaterialData.class), 
/* 105 */   JUKEBOX(84), 
/* 106 */   FENCE(85), 
/* 107 */   PUMPKIN(86, Pumpkin.class), 
/* 108 */   NETHERRACK(87), 
/* 109 */   SOUL_SAND(88), 
/* 110 */   GLOWSTONE(89), 
/* 111 */   PORTAL(90), 
/* 112 */   JACK_O_LANTERN(91, Pumpkin.class), 
/* 113 */   CAKE_BLOCK(92, 64, Cake.class), 
/* 114 */   DIODE_BLOCK_OFF(93, Diode.class), 
/* 115 */   DIODE_BLOCK_ON(94, Diode.class), 
/* 116 */   LOCKED_CHEST(95), 
/* 117 */   TRAP_DOOR(96, TrapDoor.class), 
/* 118 */   MONSTER_EGGS(97, MonsterEggs.class), 
/* 119 */   SMOOTH_BRICK(98, SmoothBrick.class), 
/* 120 */   HUGE_MUSHROOM_1(99, Mushroom.class), 
/* 121 */   HUGE_MUSHROOM_2(100, Mushroom.class), 
/* 122 */   IRON_FENCE(101), 
/* 123 */   THIN_GLASS(102), 
/* 124 */   MELON_BLOCK(103), 
/* 125 */   PUMPKIN_STEM(104, MaterialData.class), 
/* 126 */   MELON_STEM(105, MaterialData.class), 
/* 127 */   VINE(106, Vine.class), 
/* 128 */   FENCE_GATE(107, Gate.class), 
/* 129 */   BRICK_STAIRS(108, Stairs.class), 
/* 130 */   SMOOTH_STAIRS(109, Stairs.class), 
/* 131 */   MYCEL(110), 
/* 132 */   WATER_LILY(111), 
/* 133 */   NETHER_BRICK(112), 
/* 134 */   NETHER_FENCE(113), 
/* 135 */   NETHER_BRICK_STAIRS(114, Stairs.class), 
/* 136 */   NETHER_WARTS(115, MaterialData.class), 
/* 137 */   ENCHANTMENT_TABLE(116), 
/* 138 */   BREWING_STAND(117, MaterialData.class), 
/* 139 */   CAULDRON(118, Cauldron.class), 
/* 140 */   ENDER_PORTAL(119), 
/* 141 */   ENDER_PORTAL_FRAME(120), 
/* 142 */   ENDER_STONE(121), 
/* 143 */   DRAGON_EGG(122), 
/* 144 */   REDSTONE_LAMP_OFF(123), 
/* 145 */   REDSTONE_LAMP_ON(124), 
/*     */ 
/* 147 */   IRON_SPADE(256, 1, 250), 
/* 148 */   IRON_PICKAXE(257, 1, 250), 
/* 149 */   IRON_AXE(258, 1, 250), 
/* 150 */   FLINT_AND_STEEL(259, 1, 64), 
/* 151 */   APPLE(260), 
/* 152 */   BOW(261, 1, 384), 
/* 153 */   ARROW(262), 
/* 154 */   COAL(263, Coal.class), 
/* 155 */   DIAMOND(264), 
/* 156 */   IRON_INGOT(265), 
/* 157 */   GOLD_INGOT(266), 
/* 158 */   IRON_SWORD(267, 1, 250), 
/* 159 */   WOOD_SWORD(268, 1, 59), 
/* 160 */   WOOD_SPADE(269, 1, 59), 
/* 161 */   WOOD_PICKAXE(270, 1, 59), 
/* 162 */   WOOD_AXE(271, 1, 59), 
/* 163 */   STONE_SWORD(272, 1, 131), 
/* 164 */   STONE_SPADE(273, 1, 131), 
/* 165 */   STONE_PICKAXE(274, 1, 131), 
/* 166 */   STONE_AXE(275, 1, 131), 
/* 167 */   DIAMOND_SWORD(276, 1, 1561), 
/* 168 */   DIAMOND_SPADE(277, 1, 1561), 
/* 169 */   DIAMOND_PICKAXE(278, 1, 1561), 
/* 170 */   DIAMOND_AXE(279, 1, 1561), 
/* 171 */   STICK(280), 
/* 172 */   BOWL(281), 
/* 173 */   MUSHROOM_SOUP(282, 1), 
/* 174 */   GOLD_SWORD(283, 1, 32), 
/* 175 */   GOLD_SPADE(284, 1, 32), 
/* 176 */   GOLD_PICKAXE(285, 1, 32), 
/* 177 */   GOLD_AXE(286, 1, 32), 
/* 178 */   STRING(287), 
/* 179 */   FEATHER(288), 
/* 180 */   SULPHUR(289), 
/* 181 */   WOOD_HOE(290, 1, 59), 
/* 182 */   STONE_HOE(291, 1, 131), 
/* 183 */   IRON_HOE(292, 1, 250), 
/* 184 */   DIAMOND_HOE(293, 1, 1561), 
/* 185 */   GOLD_HOE(294, 1, 32), 
/* 186 */   SEEDS(295), 
/* 187 */   WHEAT(296), 
/* 188 */   BREAD(297), 
/* 189 */   LEATHER_HELMET(298, 1, 55), 
/* 190 */   LEATHER_CHESTPLATE(299, 1, 80), 
/* 191 */   LEATHER_LEGGINGS(300, 1, 75), 
/* 192 */   LEATHER_BOOTS(301, 1, 65), 
/* 193 */   CHAINMAIL_HELMET(302, 1, 165), 
/* 194 */   CHAINMAIL_CHESTPLATE(303, 1, 240), 
/* 195 */   CHAINMAIL_LEGGINGS(304, 1, 225), 
/* 196 */   CHAINMAIL_BOOTS(305, 1, 195), 
/* 197 */   IRON_HELMET(306, 1, 165), 
/* 198 */   IRON_CHESTPLATE(307, 1, 240), 
/* 199 */   IRON_LEGGINGS(308, 1, 225), 
/* 200 */   IRON_BOOTS(309, 1, 195), 
/* 201 */   DIAMOND_HELMET(310, 1, 363), 
/* 202 */   DIAMOND_CHESTPLATE(311, 1, 528), 
/* 203 */   DIAMOND_LEGGINGS(312, 1, 495), 
/* 204 */   DIAMOND_BOOTS(313, 1, 429), 
/* 205 */   GOLD_HELMET(314, 1, 77), 
/* 206 */   GOLD_CHESTPLATE(315, 1, 112), 
/* 207 */   GOLD_LEGGINGS(316, 1, 105), 
/* 208 */   GOLD_BOOTS(317, 1, 91), 
/* 209 */   FLINT(318), 
/* 210 */   PORK(319), 
/* 211 */   GRILLED_PORK(320), 
/* 212 */   PAINTING(321), 
/* 213 */   GOLDEN_APPLE(322), 
/* 214 */   SIGN(323, 1), 
/* 215 */   WOOD_DOOR(324, 1), 
/* 216 */   BUCKET(325, 1), 
/* 217 */   WATER_BUCKET(326, 1), 
/* 218 */   LAVA_BUCKET(327, 1), 
/* 219 */   MINECART(328, 1), 
/* 220 */   SADDLE(329, 1), 
/* 221 */   IRON_DOOR(330, 1), 
/* 222 */   REDSTONE(331), 
/* 223 */   SNOW_BALL(332, 16), 
/* 224 */   BOAT(333, 1), 
/* 225 */   LEATHER(334), 
/* 226 */   MILK_BUCKET(335, 1), 
/* 227 */   CLAY_BRICK(336), 
/* 228 */   CLAY_BALL(337), 
/* 229 */   SUGAR_CANE(338), 
/* 230 */   PAPER(339), 
/* 231 */   BOOK(340), 
/* 232 */   SLIME_BALL(341), 
/* 233 */   STORAGE_MINECART(342, 1), 
/* 234 */   POWERED_MINECART(343, 1), 
/* 235 */   EGG(344, 16), 
/* 236 */   COMPASS(345), 
/* 237 */   FISHING_ROD(346, 1, 64), 
/* 238 */   WATCH(347), 
/* 239 */   GLOWSTONE_DUST(348), 
/* 240 */   RAW_FISH(349), 
/* 241 */   COOKED_FISH(350), 
/* 242 */   INK_SACK(351, Dye.class), 
/* 243 */   BONE(352), 
/* 244 */   SUGAR(353), 
/* 245 */   CAKE(354, 1), 
/* 246 */   BED(355, 1), 
/* 247 */   DIODE(356), 
/* 248 */   COOKIE(357), 
/*     */ 
/* 252 */   MAP(358, 1, MaterialData.class), 
/* 253 */   SHEARS(359, 1, 238), 
/* 254 */   MELON(360), 
/* 255 */   PUMPKIN_SEEDS(361), 
/* 256 */   MELON_SEEDS(362), 
/* 257 */   RAW_BEEF(363), 
/* 258 */   COOKED_BEEF(364), 
/* 259 */   RAW_CHICKEN(365), 
/* 260 */   COOKED_CHICKEN(366), 
/* 261 */   ROTTEN_FLESH(367), 
/* 262 */   ENDER_PEARL(368, 16), 
/* 263 */   BLAZE_ROD(369), 
/* 264 */   GHAST_TEAR(370), 
/* 265 */   GOLD_NUGGET(371), 
/* 266 */   NETHER_STALK(372), 
/*     */ 
/* 270 */   POTION(373, 1, MaterialData.class), 
/* 271 */   GLASS_BOTTLE(374), 
/* 272 */   SPIDER_EYE(375), 
/* 273 */   FERMENTED_SPIDER_EYE(376), 
/* 274 */   BLAZE_POWDER(377), 
/* 275 */   MAGMA_CREAM(378), 
/* 276 */   BREWING_STAND_ITEM(379), 
/* 277 */   CAULDRON_ITEM(380), 
/* 278 */   EYE_OF_ENDER(381), 
/* 279 */   SPECKLED_MELON(382), 
/* 280 */   MONSTER_EGG(383, 64, SpawnEgg.class), 
/* 281 */   EXP_BOTTLE(384, 64), 
/* 282 */   FIREBALL(385, 64), 
/* 283 */   GOLD_RECORD(2256, 1), 
/* 284 */   GREEN_RECORD(2257, 1), 
/* 285 */   RECORD_3(2258, 1), 
/* 286 */   RECORD_4(2259, 1), 
/* 287 */   RECORD_5(2260, 1), 
/* 288 */   RECORD_6(2261, 1), 
/* 289 */   RECORD_7(2262, 1), 
/* 290 */   RECORD_8(2263, 1), 
/* 291 */   RECORD_9(2264, 1), 
/* 292 */   RECORD_10(2265, 1), 
/* 293 */   RECORD_11(2266, 1);
/*     */ 
/*     */   private final int id;
/*     */   private final Class<? extends MaterialData> data;
/*     */   private static Material[] byId;
/*     */   private static final Map<String, Material> BY_NAME;
/*     */   private final int maxStack;
/*     */   private final short durability;
/*     */ 
/* 303 */   private Material(int id) { this(id, 64); }
/*     */ 
/*     */   private Material(int id, int stack)
/*     */   {
/* 307 */     this(id, stack, null);
/*     */   }
/*     */ 
/*     */   private Material(int id, int stack, int durability) {
/* 311 */     this(id, stack, durability, null);
/*     */   }
/*     */ 
/*     */   private Material(int id, Class<? extends MaterialData> data) {
/* 315 */     this(id, 64, data);
/*     */   }
/*     */ 
/*     */   private Material(int id, int stack, Class<? extends MaterialData> data) {
/* 319 */     this(id, stack, 0, data);
/*     */   }
/*     */ 
/*     */   private Material(int id, int stack, int durability, Class<? extends MaterialData> data) {
/* 323 */     this.id = id;
/* 324 */     this.durability = (short)durability;
/* 325 */     this.maxStack = stack;
/* 326 */     this.data = (data == null ? MaterialData.class : data);
/*     */   }
/*     */ 
/*     */   public int getId()
/*     */   {
/* 335 */     return this.id;
/*     */   }
/*     */ 
/*     */   public int getMaxStackSize()
/*     */   {
/* 344 */     return this.maxStack;
/*     */   }
/*     */ 
/*     */   public short getMaxDurability()
/*     */   {
/* 353 */     return this.durability;
/*     */   }
/*     */ 
/*     */   public Class<? extends MaterialData> getData()
/*     */   {
/* 362 */     return this.data;
/*     */   }
/*     */ 
/*     */   public MaterialData getNewData(byte raw)
/*     */   {
/*     */     try
/*     */     {
/* 374 */       Constructor ctor = this.data.getConstructor(new Class[] { Integer.TYPE, Byte.TYPE });
/*     */ 
/* 376 */       return (MaterialData)ctor.newInstance(new Object[] { Integer.valueOf(this.id), Byte.valueOf(raw) });
/*     */     } catch (InstantiationException ex) {
/* 378 */       Logger.getLogger(Material.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 380 */       Logger.getLogger(Material.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (IllegalArgumentException ex) {
/* 382 */       Logger.getLogger(Material.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (InvocationTargetException ex) {
/* 384 */       Logger.getLogger(Material.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (NoSuchMethodException ex) {
/* 386 */       Logger.getLogger(Material.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (SecurityException ex) {
/* 388 */       Logger.getLogger(Material.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */ 
/* 391 */     return null;
/*     */   }
/*     */ 
/*     */   public boolean isBlock()
/*     */   {
/* 400 */     return this.id < 256;
/*     */   }
/*     */ 
/*     */   public boolean isEdible()
/*     */   {
/* 409 */     return (equals(BREAD)) || (equals(COOKIE)) || (equals(MELON)) || (equals(MUSHROOM_SOUP)) || (equals(RAW_CHICKEN)) || (equals(COOKED_CHICKEN)) || (equals(RAW_BEEF)) || (equals(COOKED_BEEF)) || (equals(RAW_FISH)) || (equals(COOKED_FISH)) || (equals(PORK)) || (equals(GRILLED_PORK)) || (equals(APPLE)) || (equals(GOLDEN_APPLE)) || (equals(ROTTEN_FLESH)) || (equals(SPIDER_EYE));
/*     */   }
/*     */ 
/*     */   public static Material getMaterial(int id)
/*     */   {
/* 434 */     if (byId.length > id) {
/* 435 */       return byId[id];
/*     */     }
/* 437 */     return null;
/*     */   }
/*     */ 
/*     */   public static Material getMaterial(String name)
/*     */   {
/* 450 */     return (Material)BY_NAME.get(name);
/*     */   }
/*     */ 
/*     */   public static Material matchMaterial(String name)
/*     */   {
/* 462 */     Validate.notNull(name, "Name cannot be null");
/*     */ 
/* 464 */     Material result = null;
/*     */     try
/*     */     {
/* 467 */       result = getMaterial(Integer.parseInt(name));
/*     */     } catch (NumberFormatException ex) {
/*     */     }
/* 470 */     if (result == null) {
/* 471 */       String filtered = name.toUpperCase();
/*     */ 
/* 473 */       filtered = filtered.replaceAll("\\s+", "_").replaceAll("\\W", "");
/* 474 */       result = (Material)BY_NAME.get(filtered);
/*     */     }
/*     */ 
/* 477 */     return result;
/*     */   }
/*     */ 
/*     */   public boolean isRecord()
/*     */   {
/* 496 */     return (this.id >= GOLD_RECORD.id) && (this.id <= RECORD_11.id);
/*     */   }
/*     */ 
/*     */   static
/*     */   {
/* 297 */     byId = new Material[383];
/* 298 */     BY_NAME = Maps.newHashMap();
/*     */ 
/* 481 */     for (Material material : values()) {
/* 482 */       if (byId.length > material.id) {
/* 483 */         byId[material.id] = material;
/*     */       } else {
/* 485 */         byId = (Material[])Java15Compat.Arrays_copyOfRange(byId, 0, material.id + 2);
/* 486 */         byId[material.id] = material;
/*     */       }
/* 488 */       BY_NAME.put(material.name(), material);
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Users\Shadow\git\jar\craftbukkit-1.2.5-R1.0\
 * Qualified Name:     org.bukkit.Material
 * JD-Core Version:    0.6.0
 */