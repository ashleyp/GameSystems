package character

class Player(name: String, player_class: PlayerClass) extends Character(name, player_class.base_stats, player_class.armor, player_class.weapon) {

  override def toString() : String = "todo"

}
