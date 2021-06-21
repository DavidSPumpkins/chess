# Openings and Defenses

At the beginning of the game, White has only twenty possible moves: move one of 
the two knights to the left or to the right, or move one of the eight pawns one 
space forward or two. Of those twenty possible openings, players tend to use 
only four or five.

Some openings are more advantageous than others, but remember: good players can 
often figure out how to overcome disadvantages, and bad players can often 
squander advantages.

Also, for what it's worth, I can beat easy programs with any of these openings. 
But with the more common openings, a program on easy will make me work harder 
for the win. It's as if they have been programmed with more strategies for the 
common openings.

It shouldn't be any problem to pre-program two or three good defenses for each 
opening, and then have the computer choose one at random. A human player might 
make a systematic study of each opening, but they will probably prioritize 
studying defenses to the more common openings.

Theoretically, Black could choose any of the twenty possible moves to respond 
regardless of White's first move, but the vast majority of players and programs 
choose a first move that they believe will best counter White's perceived 
intentions.

In this document, I intend to cover all twenty possible openings, but for each 
opening only the most likely defenses for Black to respond with.

This document is written from the perspective of White, meaning that you're 
playing White and your opponent is playing Black.

Note also that some openings depend on the second move for their 
characterization, e.g., in some cases when your first move is to move a pawn 
other than the king's pawn but your second move is to move your king's pawn to 
e4, the opening might still be considered a king's pawn opening.

## Knight openings

Either knight for a first move perhaps signals an intention to castle on that 
knight's side, at least in regular chess. Knight openings have their pros and 
cons for the Fog of War chess variant. On the one hand, you don't get to see 
anything of your opponent's forces, but on the other hand you know them to be at 
initial state at this point.

### Queenside knight to rook's file: Durkin opening, or "Sodium Attack"

1. Na3

Most openings are named after people. This one's named after Robert T. Durkin. 
The nickname "Sodium Attack" comes from the notation "Na" (the chemical symbol 
for sodium); moving the same knight to the other side would be notated Nc3.

I believe all grandmasters have thought about this opening, and may have even 
played it in a friendly game. But I also believe that they have all concluded 
that the element of surprise is not a good enough reason to choose it over the 
other knight openings.

However, I must acknowledge that Durkin himself won a few games with this 
opening. He liked this opening so much he even wrote a pamphlet about it.

[TODO: FINISH WRITING]

### Queenside knight to bishop's file: Van Geet opening

1. Nc3

This is a much more conventional opening. It helps clear the way for queenside 
castling, and it better positions your knight to rampage through your opponent's 
ranks.

For example, I like to deprive the opponent of their queen and a rook as early 
as I can, using a knight backed up by a bishop. It goes something like this:

1. Nc3 f5 
2. e4 fxe4 
3. Nxe4 Nf6 
4. Ng5 Rg8 
5. Bc4 Rh8 
6. Nf7 Ng8 
7. Nxd8

![Van Geet setup](../diagrams/openings/VanGeetSetUpQueenCapture.png)

In this case, my opponent, a program on a very popular chess website, wised up 
to my strategy and thwarted my planned rook capture. Still, I was able adjust my 
tactics and win.

Even though my second move was e4, this is still considered the Van Geet 
opening. However, because of that second move, some of the same defenses used 
against the king's pawn opening might be suitable for the Van Geet opening if 
the player opens this way.

If my second move had been Nf3, some analysts might consider this a R&eacute;ti 
opening.

#### Laroche gambit

1. Nc3 b5

### Kingside knight to bishop's file: Zukertort opening or R&eacute;ti opening

There is some disagreement as to what constitutes a R&eacute;ti opening. The 
move

1. Nf3

is thought by some to be enough only to define the Zukertort opening. It's a 
R&eacute;ti opening depending on how Black responds and how it goes from there.

This might also be considered a R&eacute;ti opening, even though it looks like a 
Van Geet opening at first:

1. Nc3 Nc6
2. Nf3 Nf6

Though that might not be considered a four knights game.

Opponent might respond to the R&eacute;ti opening with the reversed Mexican 
defense or the black mustang defense.

Tennison gambit

1. Nf3 d5
2. e4

Ruy L&oacute;pez opening, Spanish countergambit

1. Nf3 d5
2. e4 e5
3. Bb5+ Nc6

Dutch variation

This opening can be considered a king's pawn opening if your second move is e4, 
e.g.,

1. Nf3 d5
2. e4 e5
3. Bb5+ Qd7
4. Bxd7+ Bxd7
5. exd5 ...

This also illustrates the elephant gambit, in which Black makes an ill-advised 
attempt to control the middle of the board.

Though that particular bot held out a lot longer than a higher rated bot I used 
this opening on.

1. Nf3 f6 
2. e4 e6 
3. Nd4 c6 
4. Qh5+ Ke7 
5. Nf5+ exf5 
6. exf5 Kd6 
7. Qg4 a5 
8. Qf4+ Ke7 
9. Qe4+ Kd6 
10. d4 a4 
11. Bf4# 1-0

That's the Arctic defense, and that particular game shows just one way out of 
several it could go wrong for Black.

The Polish defense works a lot better for Black:

1. Nf3 b5

Alekhine's Defense: John Tracy Gambit

1. Nf3 Nf6
2. e4

Quite surprisingly to me, the Van Geet opening can be considered a R&eacute;ti 
if your second move is Nf3, e.g.,

1. Nc3 Nf6
2. Nf3

Nimzowitsch Defense Declined: Colorado Countergambit Accepted

1. Nf3 f5 2. e4 Nc6 3. exf5 h5 4. Bd3 Rb8 5. f6 d6 6. fxg7 Bxg7 7. Bg6+ Kf8 8.
Ng5 Nf6 9. Ne6+ Bxe6 10. Nc3 Nd4 11. Nb5 Kg8 12. Nxd4 Bf7 13. Bxf7+ Kf8 14. Ne6+
Kxf7 15. Nxd8+ Kg6 16. Ne6 c6 17. Nxg7 Kxg7 18. Qf3 Ra8 19. Qg3+ Ng4 20. Qc3+
Ne5 21. d4 Rhb8 22. dxe5 Rc8 23. exd6+ Kg6 24. dxe7 c5 25. O-O Rc7 26. Bf4 Rc6
27. Qf3 Kf7 28. Bg5+ Kg6 29. Bh4 Rb6 30. Qe3 a6 31. e8=Q+ Rxe8 32. Qxe8+ Kh7 33.
Qf7+ Kh6 34. Rae1 c4 35. Re6+ Rxe6 36. Qxe6+ Kg7 37. Rd1 a5 38. Rd7+ Kf8 39.
Qf6+ Ke8 40. Re7+ Kd8 41. Qf8# 1-0

R&eacute;ti Opening: Dutch, Lisitsyn, Rydel-Bloodgood Gambit, 3.Ne5

#### Black mustang defense

1. Nf3 Nc6

### Kingside knight to rook's file: Amar opening

1. Nh3

Black will probably respond by moving their queen's pawn one or two spaces 
forward, in either case threatening your knight with their queenside bishop 
right off the bat.

## Pawn two spaces forward

Since pawns can initially move forward two spaces, it makes sense to take 
advantage of this from the beginning of the game. Your opponent might respond by 
moving their corresponding pawn forward two spaces, effectively stymying both 
pawns until such time as either one of them can capture or is itself captured.

Another option is that your opponent might offer a pawn sacrifice. Then it'll be 
up to you to decide to take them up on it or pass it up.

Or, perhaps better, they might move a pawn that neither stymies your pawn nor 
threatens to capture, as they're more interested in mobilizing their own pieces.

### Queenside rook's pawn: Ware opening

1. a4

This is a good way to get the queenside rook going, if you're not interested in 
queenside castling.

#### Meadow hay trap

1. a4 e5
2. Ra3 d6

As soon as I saw that Black king's pawn forward, I thought I had an opportunity 
for an early check with my rook. But foreseeing that, my opponent prepares a 
pawn to capture my rook, so I had to make other plans. I still won the game.

### Queenside knight's pawn: Polish opening

1. b4

This doesn't immediately help the queenside rook get out,

Potential responses: Kucharkowski-Meybohm gambit, Birmingham gambit 

#### Symmetrical variation

1. b4 b5

#### Outflank variation

1. b4 c6

#### French Defense: Banzai-Leong Gambit

1. b4 e6 
2. e4 d5 
3. exd5 Qxd5 
4. Bd3 Qxg2

Nimzowitsch Defense: Wheeler Gambit, 

1. b4 Nc6
2. e4 Nxb4

#### Caro-Kann Defense: Labahn attack

1. b4 d6
2. e4 d5

OR

1. b4 e5
2. e4 c6

### Queenside bishop's pawn: English opening

1. c4

Opponent might respond with the Anglo-Indian defense

Or with the "symmetrical variation," in which Black mirrors your opening move:

1. c4 c5

Anglo-Scandinavian defense

1. c4 d5

King's English variation

1. c4 e5

Or with "King's English, queen's variation"

1. c4 Nf6

English opening, reversed Sicilian variation

1. c4 e5
2. Nc3

English Opening: Caro-Kann Defensive System

1. c4 c6

### Queen's pawn opening

1. d4

Apparently this one doesn't have a special name. Your opponent might put you in 
check early on, but such pre-middlegame attempts are easily repelled.

Statistics suggest you have a 40% chance of winning with this opening, and a 36% 
chance of drawing. That means only a 24% chance of losing. But of course this 
ignores other factors, such as how your opponent's skills compare to yours.

#### Australian defense

1. d4 Na6

#### Mikenas defense

1. d4 Nc6

#### Indian game

1. d4 Nf6

##### Indian game, knights variation

1. d4 Nf6
2. Nf3 Nd5

#### Knight to king's rook's file

1. d4 Nh6

An unlikely defense, has probably never occurred in tournament play.

#### Amazon defense

1. d4 d5
2. Qd3 Nf6

##### Amazon attack

1. d4 d5
2. Qd3 Qd6

##### Queen's gambit

The most famous move sequence for the queen's pawn opening.

1. d4 d5
2. c4

##### Blackmar-Diemer gambit

1. d4 d5
2. e4

Will Black capture the White pawn on e4? White might be more interested in an 
early check.

1. d4 d5
2. e4 dxe4
3. Bb5+

The best answer for Black is c6, forcing the White bishop to retreat or be 
captured. But sometimes an easy bot playing Black will respond with Qd7. Then 
the sacrifice of a bishop for a queen is quite worthwhile for White.

#### Englund gambit

1. d4 e5

[FINISH WRITING]

#### Dutch defense

1. d4 f5

##### Dutch Defense: Staunton Gambit Accepted

1. d4 f5
2. e4 fxe4
3. Qh5+ 

#### Borg defense

1. d4 g5

#### St. George defense

1. d4 a6

But if White's next move is e4, then this is a king's pawn opening.

#### Horwitz defense

This defense has the potential to put your king in check on barely the second 
move.

1. d4 e6
2. Qd3 Bb4+

#### Keres transpositional variation

Another defense with the potential for an early check.

1. d4 e6
2. c4 Bb4+

### King's pawn opening

1. e4

The king's pawn opening is the most popular opening, and probably the most 
closely studied. No branches of the chess game tree have been analyzed as 
closely as the ones stemming from this opening.

Some analysts might still consider other first moves as a king's pawn opening if 
your second move is the king's pawn forward two spaces.

1. b3 e5
2. e4

On the one hand, this sort of opening might feel like you're leaving your king 
unprotected too early in the game. But remember: your opponent hasn't begun 
mobilizing yet. Follow this opening by mobilizing your queen and kingside 
bishop.

#### Lemming's defense

1. e4 Na6

However, if you follow this up with Nf3, it might be considered a R&eacute;ti 
opening instead.

#### Nimzowitsch defense

1. e4 Nc6

##### Nimzowitsch defense, declined

1. e4 Nc6
2. Nf3

##### Nimzowitsch defense, declined: Williams variation

1. e4 Nc6
2. Nf3 d6

##### Nimzowitsch defense, Kennedy variation

1. e4 Nc6
2. d4 e5
3. dxe5

#### Alekhine's defense

1. e4 Nf6

##### Alekhine's Defense: Mar&ocric;czy Variation

1. e4 Nf6
2. d3 d5
3. Qe2

##### Alekhine's Defense: Normal Variation

1. e4 Nf6
2. e5 Nd5
3. d4 e6

##### Alekhine's Defense: John Tracy Gambit

1. e4 Nf6
2. Nf3 Nxe4
3. d3

##### Alekhine's Defense: Scandinavian Variation

1. e4 Nf6
2. d3 d5
3. Nc3 Bg4
4. Nf3

1. e4 Nf6 2. d3 d5 3. Nc3 Bg4 4. Nf3 dxe4 5. h3 exf3 6. Bd2 fxg2 7. f4 gxh1=Q 8.
b4 Bxh3 9. Bc1 Bxf1 10. Kd2 Qg2+ 11. Ke1 Qg3+ 12. Kxf1 Qd4 13. Be3 Qh3+ 14. Ke1
Qdxe3+ 15. Ne2 Qh4+ 16. Kf1 Qhf2# 0-1

##### Alekhine's Defense: Mokele Mbembe Variation

1. e4 Nf6
2. e5 Ne4
3. d3

##### Alekhine's Defense: Krejcik Variation

1. e4 Nf6
2. Bc4 d5
3. exd5

#### Hippopotamus defense

1. e4 Nh6

Your opponent might try to deprive you of your queen early on.

1. e4 Nh6
2. d3 d5
3. e5 Bg4

Perhaps the best way to block that is

4. Nf3

#### Ware defense

1. e4 a5

#### Queenside knight's pawn forward two spaces

1. e4 b5

Essentially you're telling your opponent to take that pawn.

#### Sicilian defense

1. e4 c5

##### Sicilian defense, old Sicilian variation

1. e4 c5
2. Nf3 Nc6

##### Sicilian defense, open

1. e4 c5
2. Nf3 Nc6
3. d4 cxd4

##### Sicilian defense, closed, traditional line

1. e4 c5
2. Nf3 Nc6
3. Nc3 e5

##### Sicilian defense, Alapin variation

1. e4 c5
2. c3

##### Sicilian defense, Smith-Morra gambit

1. e4 c5
2. d4 cxd4
3. Qxd4

#### Scandinavian defense

1. e4 d5

##### Scandinavian defense, closed

1. e4 d5
2. Nc3

##### Scandinavian Defense: Mieses-Kotr&ccaron; variation

1. e4 d5
2. exd5 Qxd5
3. Nc3

##### Scandinavian defense, modern variation

1. e4 d5
2. exd5 Nf6
3. Bb5+

#### Center game

1. e4 e5
2. d4

##### Center game accepted

1. e4 e5
2. d4 exd4

![Center game accepted](../diagrams/openings/CenterGameAccepted.png)

#### Bishop's opening, Berlin defense

1. e4 e5
2. Bc4 Nf6
3. d3

#### King's gambit

1. e4 e5
2. f4

Will Black capture that bishop's pawn offered for sacrifice?

##### King's gambit accepted, Schurig gambit

1. e4 e5
2. f4 exf4
3. Bd3

##### King's gambit declined, Keene defense

1. e4 e5
2. f4 Qh4+

Sometimes offense is the best defense. Of course White will simply block that 
check with the knight's pawn.

##### Knight variation

1. e4 e5
2. Nf3

##### Knight variation, elephant gambit

1. e4 e5
2. Nf3 d5
3. exd5

##### "Sicilian Defense: Amazon Attack"  [FINISH WRITING]

1. e4 e5 
2. Qg4 Qf6 
3. Bc4 Bc5 
4. Ne2 Bb6 
5. d4 exd4 
6. Nxd4 Nh6 
7. O-O a6 
8. Bf4 Nxg4 
9. Be5 Qxe5 
10. Nc6 Qxh2# 0-1

##### Scotch game

1. e4 e5
2. Nf3 Nf6
3. d4 exd4

##### Leonardis variation

1. d3 e5
2. e4

This one looks like the Mieses opening, but if that king's pawn goes forward on 
the second move, it doesn't really matter anymore that the queen's pawn moved 
first.

#### King's Pawn Opening: D&uring;ras Gambit

1. e4 f5
2. Qh5+

#### Borg defense

1. e4 g5

Zilbermint's gambit ???

#### Goldsmith defense

1. e4 h5

#### St. George defense

1. e4 a6

I can still beat an easy bot with this defense. But it took me a lot of effort, 
and two promoted pawns.

It still counts as a king's pawn opening with St. George defense if it starts 
out as a queen's pawn opening.

1. d4 a6
2. e4

##### St. George defense, Zilbermints gambit

1. d4 a6
2. e4 e5

#### Owen defense

1. e4 b6

#### Caro-Kann defense

1. e4 c6

#### Pirc defense

1. e4 d6

#### French defense

1. e4 e6

##### French defense, normal variation

1. e4 e6
2. d4

##### French defense, king's Indian attack

1. e4 e6
2. d3

##### Barnes defense

1. e4 f6

This defense gives Black the same vulnerability the Barnes opening gives White, 
the potential for a second move check.

1. e4 f6
2. Qh5+ g6

 an embarrassing early checkmate. FINISH WRITING

##### Modern defense

1. e4 g6

##### Carr defense

1. e4 h6

##### Carr defense, Zilbermints gambit

1. e4 h6
2. d4 e5
3. Bd2 exd4
4. Na3

Napoleon attack

King's pawn opening, king's knight variation

1. Nf3 e5?
2. e4

### Kingside bishop's pawn: Bird's opening

1. f4

With this opening, be absolutely certain to also open an avenue of escape for 
your king, or else risk an embarrassingly early checkmate. Like this:

1. f4 e5
2. fxe5 Qh4+

![Bird opening embarrassment](../diagrams/openings/BirdEmbarrassment.png)

Actually, it's not checkmate, since you can respond like this:

3. g3

Or prepare a counter to such a checkmate attempt:

1. f4 e5
2. Nf3 Qh4+
3. Nxh4

The Dutch variation

1. f4 d5

Dutch variation, Williams gambit

1. f4 d5
2. e4 dxe4

King's gambit declined, Falkbeer countergambit

1. f4 d5
2. e4 e5
3. Bb5+ c6
4. Ba4 Nf6

This sequence

1. f4 ...
2. e3

gives your king an out if your opponent sends their queen to h4.

If you stick around longer with this opening, you might pull

King's Gambit Declined: Soller-Zilbermints Gambit

From's gambit

1. f4 e5

From's gambit and Langheld gambit

Double duck formation

#### Swiss gambit

1. f4 f5
2. e4

### Kingside knight's pawn: Grob opening

1. g4

Your opponent might respond to this opening with the Alessi gambit.

1. g4 f5
2. gxf5

I see no disadvantage for White to immediately capture that pawn. But you might 
have other priorities at this point in the game.

Generally this might not seem like a good opening for kingside castling. 
However, if your opponent's king ventures far out enough to file f, kingside 
castling might just be the way to a clever check.

Sicilian defense: Grob variation

#### Double Grob variation

1. g4 g5

### Kingside rook's pawn: K&aacute;das opening

1. h4

Your opponent will quite predictably try to make an early incursion into your 
side of the board with a bishop, e.g.,

1. h4 d5
2. g4 Bxg4

Schneider gambit

Koola-Koola variation

1. h4 a5

[TODO: FINISH WRITING]

Pirc Defense: Petruccioli Attack

1. h4 d6
2. e4

## Pawn one space forward

These openings strike me as particularly cautious. Some of them are just as good 
as their corresponding two-spaces-forward openings for mobilizing the queen and 
the bishops, while perhaps offering some more protection for the king.

### Queenside rook's pawn: Anderssen opening

1. a3

Not as good as the Ware opening, in my opinion, because it doesn't help your 
rook get out, and it restricts the queenside knight to move to c3 (since d2 is 
for the time being also occupied by a pawn).

Some players might care more about the statistics: this is the second worst 
opening because you only have a 3-in-10 chance of winning. But of course that's 
ignoring how good your opponent is.

A really good player will overcome the disadvantages of this opening, while a 
really bad opponent will squander the initial advantage, such as perhaps by 
choosing a bad defense to counter.

Note that if your second move is your king's pawn forward two spaces, e.g.,

1. a3 e5 
2. e4 

then this is considered a king's pawn opening, and it's called the Mengarini 
opening.

#### Sicilian defense, Mengarini variation

1. a3 c5
2. e4 Nc6

### Queenside knight's pawn: Nimzowitsch-Larsen attack 

1. b3

I think this is a bad choice to prepare for queenside castling. This opening 
might still be considered a king's pawn opening if your second move is e4.

Watch out for an embarrassing early checkmate with the modern variation of the 
Nimzowitsch-Larsen:

1. b3 e5 
2. Bb2 Qf6 
3. e4 Bc5 
4. Bd3 Qxf2#

"Sicilian Defense: Snyder Variation" [FINISH WRITING]

French Defense: Horwitz Attack

1. b3 e6
2. e4 Nf6

Scandinavian defense

1. b3 d5
2. e4

Classical variation

1. b3 d5
2. e3 e5

Note that if your second move is e4, this opening might be considered a king's 
pawn opening by some analysts, e.g.,

1. b3 e5
2. e4

### Queenside bishop's pawn: Saragossa opening

1. c3

This one's good for getting your queen out early on. But if you also want to get 
one of your bishops going early, choose another opening, like maybe king's pawn.

However, King's Pawn Opening: MacLeod Attack

1. c3 e5
2. e4 

Sicilian defense: Alapin variation [FINISH WRITING]

### Queen's pawn: Mieses opening

1. d3

The easy bots tend to respond with the reversed rat variation, and then I like 
to threaten the queen with my bishop backed up by my own queen.

1. d3 e5
2. Be3 d6
3. Qd2

They never take the bait, but I'm usually able to get their queen some other 
way.

But if the second move is the king's pawn forward two spaces,

1. d3 e5
2. e4

[FINISH WRITING]

Also, if your second move is your kingside knight, it might be considered a 
R&eacute;ti opening, old Indian attack.

1. d3 Nf6
2. Nf3 d5

### King's pawn: Van't Kruijs opening

1. e3

Statistically, this is the worst opening. According to the statistics, you only 
a 28% chance of winning with this opening, and only a 25% chance of stalemate. 
Which means almost a 1-in-2 chance you will lose. But of course those are odds 
without knowing anything about your opponent.

For what it's worth, I can beat all the easy computer programs, like Stockfish 
level 1) with this opening. For the hard programs, like Stockfish level 8, I'm 
gonna lose no matter what opening I use.

What it boils down to


you'll probably wish you had started with e4.

### Kingside bishop's pawn: Barnes opening

1. f3

This is a particularly bad opening, in my opinion. It exposes your king to check 
from your opponent's queen or kingside bishop very early on, and it makes 
mobilizing your own queen and bishops rather awkward.

If you use this opening, be absolutely certain to also open an avenue of escape 
for your king, or else risk an embarrassingly early checkmate. Like this:

1. f3 e6
2. g4 Qh4#

![Barnes embarrassment](../diagrams/openings/BarnesEmbarrassment.png)

Even if you successfully fend off that second move check, you still need to open 
an avenue of escape for your king, since your opponent might find a different 
way to exploit the situation.

1. f3 e5
2. Nc3 Qh4+
3. g3 Qf6
4. e4 Bc5
5. Nce2 Qb6
6. Rb1 Bf2# 0-1

![Barnes 6-move checkmate](../diagrams/openings/Barnes6MoveCheckmate.png)

As with quite a few other openings, this one can be reclassified as a king's pawn opening depending on your second move.

#### King's pawn opening, king's head opening

1. f3 e5
2. e4

### Kingside knight's pawn: Hungarian opening

1. g3

Also called "king's fianchetto opening."

#### Dutch, Pachman gambit

1. g3 f5
2. e4 fxe4
3. Qh5+ g6

#### Myers defense

1. g3 g5
2. e4 e6

#### Siclian defense: Lasker-Dunn attack

1. g3 c5
2. e4

### Kingside rook's pawn: Clemenz opening

1. h3

A rather awkward opening that wastes initial momentum, in my opinion.

[TODO: FINISH WRITING]