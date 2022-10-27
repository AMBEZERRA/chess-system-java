package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Collor;

public class Rook extends ChessPiece {

	public Rook(Board board, Collor color) {
		super(board, color);
		
	}

@Override

public String toString() {
	return "R";
}

}
