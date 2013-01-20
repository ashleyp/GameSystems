package test

import item.Potion
import item.Weapon
import item.Armor

import character.Enemy
import character.Player

import world.World

import java.io.File

object TestHarness extends App {


  val world = new World("Wario World")

  val poringBaseStats   = Map("Agility" -> 12, "Vitality" -> 5)
  val poporingBaseStats = Map("Agility" -> 16, "Vitality" -> 10)
  
  val headArmor   = new Armor("Apple of Archer", 1500, 10, null)
  val chestArmor  = new Armor("Saints Robe", 3600, 23, Map("Intelligence" -> 1))
  
  val equippedWeapon = new Weapon("Sword of awesomeness.", 2000, 1, 10)
  val equippedArmor  = Map("head" -> headArmor, "chest" -> chestArmor)


  val poring   = new Enemy("Poring", poringBaseStats, null, null)
  val poporing = new Enemy("Poporing", poporingBaseStats, equippedArmor, equippedWeapon)

  world.spawnEnemy( poring )
  world.spawnEnemy( poporing )
 
  val totalEnemies = world.getEnemies().length 
  println( "\nCurrently Spawned enemies (" + totalEnemies + "):\n" + world.enemiesToString() )


  val potion = new Potion("Potion of super heals", 150)
  //println(potion.toString())

}

