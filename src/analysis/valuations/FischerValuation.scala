package analysis.valuations

import analysis.Centipawns
import game.pieces.Piece
// THIS WILL FAIL THE FIRST TEST
object FischerValuation extends ConstantCentipawnValuation(Map(classOf[Piece] -> Centipawns(-250)))