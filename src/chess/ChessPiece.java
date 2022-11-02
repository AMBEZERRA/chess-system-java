package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Collor color;
 
	public ChessPiece(Board board, Collor color) {
		super(board);
		this.color = color;
	}

	public Collor getColor() {
		return color;
	}

	protected boolean isthereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
		
}
