package world

import character.Enemy

class World(name: String) {

  private var currentEnemies: Array[Enemy] = Array()

  def spawnEnemy(enemy: Enemy) : Int = {
    currentEnemies :+= enemy
    return currentEnemies.length
  }

  def getEnemies() : Array[Enemy] = currentEnemies
  def enemiesToString() : String = currentEnemies.mkString("\n")


}
