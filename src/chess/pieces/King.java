package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Collor;

public class King extends ChessPiece {

	public King(Board board, Collor color) {
		super(board, color);
		
	}

	public String toString() {
		return "K";
	}
}
