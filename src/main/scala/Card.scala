class Edge(val suit: Char, val connection: Char) {
  def this(suit_connection: String) {
    this(suit_connection(0), suit_connection(1))
  }

  def fit(e: Edge) = e.suit == suit && e.connection != connection
}

