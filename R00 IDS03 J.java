if ( l o g i n S u c c e s s f u l ) {
l o g g e r . s e v e r e ( ” User l o g i n s u c c e e d e d f o r : ” + + s a n i t i z e U s e r (username) ) ;
} e l s e {
logger . s e v e r e ( ” User l o g i n f a i l e d f o r : ” +  s a n i t i z e U s e r (username) ) ;
}
p u b l i c S t r i n g s a n i t i z e U s e r ( S t r i n g username ) {
r e t u r n P a t t e r n . matches ( ” [ A−Za−z0−9 ]+” , username ) )
? username : ” u n a u t h o r i z e d u s e r ” ;
}