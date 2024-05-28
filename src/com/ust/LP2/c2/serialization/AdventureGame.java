package com.ust.LP2.c2.serialization;

public class AdventureGame {
    int x;
    int y;
    public int add(){
        int i = x + y;
        return i;
    }
    // if our data will be used only by java programs that generated it:
    // 1)serialization
    // write a file that hold the flattened (serialized) objects.
    // then have your program read the serialized objects from the file and
    // inflate them back into living, breathing, heap-inhabiting object.

    // if our data will be used by other programs :
    // write a plain text file:
    // write a file,with deliminiter that other programs can parse.
    // for example, a-tab-deliminted file that a spreadsheet or database
    // application could use.
    // ---------------------------------------------------------------------------
    /* *
     * fanatsy avdenture game:game program it take more than one session to complete.
     * as the game progresses, character in the game becomes stronger, weaker, smarter etc.
     * ---------
     * we don't want to start the game from scratch every time we launches it.
     * we need a way to save the state of characters and a way to restore the state when we resume the game.
     *
     * GameCharacter{
     * int power, String type, Weapon[] weapons
     * getWeapons() useWeapons() increasePower()
     * }
     *
     * three character that we want to save.
     * 01: power: 200, type : vis, weapons: bare, bomb
     *
     * 02: power: 50, type : axel, weapons: bow, arrow, bomb
     *
     * 03: power: 120, type: anu, weapons: knife, rope
     * */

}
