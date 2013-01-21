package character

class Player(name: String, player_class: PlayerClass) extends Character(name, player_class.base_stats, player_class.armor, player_class.weapon) {

  def getMaxHitPoints() : Int = {
    player_class.base_stats("Vitality") * player_class.hpMultiplier
  }
  
  override def toString() : String = {
    "Name: "   + name +
    "\nBase Stats: "  + super.getBaseStats() +
    "\nArmor: "  + super.getArmor() + 
    "\nWeapon: " + super.getWeapon()
  }

}
