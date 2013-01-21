package character.playerclass

import character.PlayerClass
import character.player.Inventory

import item.Weapon
import item.Armor
import item.Potion

object MageClass extends PlayerClass { 

  val weapon: Weapon = {
     new Weapon("Noob staff", 1, 1, 1)
   }

   val armor: Map[String, Armor] = {
     Map("head" -> new Armor("Noob magical hat", 100, 1, null))
   }

   val base_stats: Map[String, Int] = {
     Map("Vitality" -> 10, "Intelligence" -> 10)
   }

   val startInventory = {
     new Inventory(
       Array(new Potion("Potion of mana", 150))
     )
   }


   val hpMultiplier: Int = 2

   override def toString(): String = {
     "(Weapon: " + weapon.toString() +
     ", Armor: " + armor.toString() +
     ", Base Stats: " + base_stats.toString() + ")"
   }

}
