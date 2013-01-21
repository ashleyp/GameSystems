package character.player

import item.Item

class Inventory(var currentItems: Array[Item]) {

  def addItem(newItem: Item) : Int = {
    currentItems :+= newItem
    currentItems.length
  }

  override def toString() : String = {
    currentItems.mkString(",")
  }

}
