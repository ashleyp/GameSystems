package character.playerclass

import character.PlayerClass

import item.Weapon
import item.Armor

object WarriorClass extends PlayerClass { 

  val weapon: Weapon = {
     new Weapon("Noob Sword", 1, 1, 2)
   }

   val armor: Map[String, Armor] = {
     Map("head" -> new Armor("Noob hat", 100, 1, null))
   }

   val base_stats: Map[String, Int] = {
     Map("Vitality" -> 10, "Strength" -> 10)
   }

   val hpMultiplier: Int = 10


   override def toString(): String = {
     "(Weapon: " + weapon.toString() +
     ", Armor: " + armor.toString() +
     ", Base Stats: " + base_stats.toString() + ")"
   }

}
