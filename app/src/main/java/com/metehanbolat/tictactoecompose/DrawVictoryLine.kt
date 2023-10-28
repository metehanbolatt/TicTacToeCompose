package com.metehanbolat.tictactoecompose

import androidx.compose.runtime.Composable
import com.metehanbolat.tictactoecompose.component.WinDiagonalLine1
import com.metehanbolat.tictactoecompose.component.WinDiagonalLine2
import com.metehanbolat.tictactoecompose.component.WinHorizontalLine1
import com.metehanbolat.tictactoecompose.component.WinHorizontalLine2
import com.metehanbolat.tictactoecompose.component.WinHorizontalLine3
import com.metehanbolat.tictactoecompose.component.WinVerticalLine1
import com.metehanbolat.tictactoecompose.component.WinVerticalLine2
import com.metehanbolat.tictactoecompose.component.WinVerticalLine3

@Composable
fun DrawVictoryLine(
    state: GameState
) {
    when(state.victoryType) {
        VictoryType.HORIZONTAL1 -> WinHorizontalLine1()
        VictoryType.HORIZONTAL2 -> WinHorizontalLine2()
        VictoryType.HORIZONTAL3 -> WinHorizontalLine3()
        VictoryType.VERTICAL1 -> WinVerticalLine1()
        VictoryType.VERTICAL2 -> WinVerticalLine2()
        VictoryType.VERTICAL3 -> WinVerticalLine3()
        VictoryType.DIAGONAL1 -> WinDiagonalLine1()
        VictoryType.DIAGONAL2 -> WinDiagonalLine2()
        VictoryType.NONE -> {}
    }
}