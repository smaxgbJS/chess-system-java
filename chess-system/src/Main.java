import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

void main() {
    ChessMatch chessMatch = new ChessMatch();
    UI.printBoard(chessMatch.getPieces());
}
