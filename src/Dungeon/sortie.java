package Dungeon;

import java.util.Random;
import java.util.Scanner;

//|  A fight between the hero and a  monster
//|
//|  The fight continues until one contestant is dead or
//|  the hero runs away.
public class sortie
{
    char buffer[] = new char[132];
    actor hero;
    actor monster;
    //////
    public void sortie()
    {
        int monsterThrow,
        heroThrow;
        int bothAlive = 1;
        int runAway = 0;
        
        while (bothAlive == 1 && runAway != 0) //maybe problematic
        {
            System.out.print("\n\n\tWhat do you wish to do? (f fight, r run away, d duck) ");
            Scanner scan = new Scanner(System. in );
            scan.nextLine();
            //Hero Fights the Monster
            if (buffer[0] == 'f' || buffer[0] == 'F')
            {
                System.out.print("\n\n\tYou attack the " + monster.name+"\n\n");
                monsterThrow = randInt(1, monster.strength);
                heroThrow = randInt(1, hero.strength);
                
                if (heroThrow == monsterThrow)
                {
                    System.out.print("\tYou swing and miss.\n");
                    print("\tThe " + monster.name + " swings and misses.\n\n");
                }
                else if (heroThrow > monsterThrow + 2)
                {
                    System.out.print("\tWHAMO!! You hit the monster hard.\n");
                    System.out.print("\tThe " + monster.name + " looses two hit points.\n\n");
                    monster.hitPoints -= 2;
                }
                else if (heroThrow > monsterThrow)
                {
                    System.out.print("\tBAM!! You swing and hit.\n");
                    System.out.print("\tThe " + monster.name + " looses a hit point.\n\n");
                    monster.hitPoints--;
                }
                else if (heroThrow < monsterThrow - 2)
                {
                    System.out.print("\tOUCH OUCH OUCH!! The " + monster.name + " hits you.\n");
                    System.out.print("\tYou loose two hit point.\n\n");
                    hero.hitPoints -= 2;
                }
                else
                {
                    System.out.print("\tOOF!! The " + monster.name + " hits you.\n");
                    System.out.print("\tYou loose a hit point.\n\n");
                    hero.hitPoints--;
                }
            }
            //Hero Runs Away
            else if (buffer[0] == 'r' || buffer[0] == 'R')
            {
                System.out.print("\n\tYou run away from the " + monster.name);
                System.out.print("\tThe " + monster.name + "throws a shurikin at your back!!\n");
                monsterThrow = (int)(Math.random() * 4) + 1;
            }
            if (monsterThrow > 3)
            {
                System.out.print("\tIt hits! You lose a hit point\n");
                hero.hitPoints--;
            }
            else System.out.print("\tIt misses.\n");
            runAway = 1;
        }
        //Hero ducks the Monster's blow
        //else
        {
            System.out.print("\n\n\tYou duck from the monster's blow.\n");
            monsterThrow = randInt(1, monster.strength);
            heroThrow = randInt(1, hero.strength);
            if (hero.hitPoints < hero.maxHitPoints && heroThrow > 3 * monsterThrow / 4)
            {
                System.out.print("\tThe " + monster.name + " misses.\n\n");
                System.out.print("\tYour tricky move gains you a hit point!!!\n");
                hero.hitPoints++;
            }
            else if (heroThrow > monsterThrow / 2)
            {
                System.out.print("\tThe " + monster.name + " misses.\n\n");
            }
            else
            {
                System.out.print("\tThe " + monster.name + " hits you anyway.\n");
                System.out.print("\tYou loose a hit point!\n\n");
                hero.hitPoints--;
            }
        }
        //Determine the outcome of this exchange of blows
        if (hero.hitPoints <= 0)
        {
            System.out.print("\n\t\t\tYou moan... and die...\n\n");
            bothAlive = 0;
        }
        else if (monster.hitPoints <= 0)
        {
            System.out.print("\tThe " + monster.name + " drops dead.\n\n");
            bothAlive = 0;
        }
        summary();
        //The monster hears its mommy calling
        if (monster.hitPoints > 0 && monster.hitPoints < hero.hitPoints && (int)(Math.random() * 10) + 1 == 1)
        {
            runAway = 1;
            System.out.print("\n\t\tThe " + monster.name + " turns tail and runs away!\n\n");
        }
        //end while
        //Final Result of the Sortie
        if (runAway != 0 && hero.hitPoints > 0) 
        {
            System.out.print("\n\n\tYou gain strength from your experience\n");
            hero.strength++;
            hero.maxStrength++;
            heroSummary();
            System.out.print("\n");
        }
    }    
}
