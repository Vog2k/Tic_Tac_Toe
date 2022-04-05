package com.example.tic_tac_toe;

//These Are Just The Imported Code Words//
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class TicTacToeBoard extends View {
    //These Prep The Tic Tac Toe Board //
    private final int boardColor;
    private final int XColor;
    private final int OColor;
    private final int winningLineColor;

    private final Paint paint = new Paint();
    private int cellSize = getWidth() / 3;

    public TicTacToeBoard(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);


        TypedArray a = context.getTheme().obtainStyledAttributes(attrs,
                R.styleable.TicTacToeBoard, 0, 0);

        try {
//Doing This Make This Code Accessable To Use Within The Private Words Above//
            boardColor = a.getInteger(R.styleable.TicTacToeBoard_boardColor, 0);
            XColor = a.getInteger(R.styleable.TicTacToeBoard_XColor, 0);
            OColor = a.getInteger(R.styleable.TicTacToeBoard_OColor, 0);
            winningLineColor = a.getInteger(R.styleable.TicTacToeBoard_winningLineColor, 0);
        } finally {
            a.recycle();
        }

    }

    @Override
    protected void onMeasure(int width, int height) {
        super.onMeasure(width, height);

        int dimensions = Math.min(getMeasuredWidth(), getMeasuredHeight());
        cellSize = dimensions / 3;

        setMeasuredDimension(dimensions, dimensions);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);

        drawGameBoard(canvas);

        drawX(canvas, 1, 1);
    }

    private void drawGameBoard(Canvas canvas) {
        paint.setColor(boardColor);
        paint.setStrokeWidth(16);

        for (int c = 1; c < 3; c++) {
            canvas.drawLine(cellSize * c, 0, cellSize * c, canvas.getWidth(), paint);
        }


        for (int r = 1; r < 3; r++) {
            canvas.drawLine(0, cellSize * r, canvas.getWidth(), cellSize * r, paint);
        }
//These Lines Are Writting The Code To Draw Lines//
    }

    private void drawX(Canvas canvas, int row, int col) {
        paint.setColor(XColor);

        canvas.drawLine((col+1)*cellSize,
                        row*cellSize,
                        col*cellSize,
                        (row+1)*cellSize,
                        paint);

        canvas.drawLine(col*cellSize,
                        row*cellSize,
                        (col+1)*cellSize,
                        (row+1)*cellSize,
                        paint);

        private void drawO(Canvas canvas, int row, int col) {
            paint.setColor(OColor);

            canvas.drawOval(col*cellSize,
            row*cellSize,
                    );
    }
}
