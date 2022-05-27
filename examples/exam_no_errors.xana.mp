
#source	"exam_no_errors.xana"


' Invocation to the main function
call main
halt


#line	1

f:
	' Parameters
	' a :: boolean (offset 8)
	' b :: boolean (offset 6)
	' c :: boolean (offset 4)
	' Local variables
	enter	0

#line	2
	' Return
	push	bp
	pushi	8
	addi
	loadi
	push	bp
	pushi	6
	addi
	loadi
	and
	push	bp
	pushi	4
	addi
	loadi
	not
	or
	ret	2, 0, 6

#line	5

main:
	' Parameters
	' Local variables
	' b1 :: boolean (offset -2)
	' b2 :: boolean (offset -4)
	' b3 :: boolean (offset -6)
	' a :: int (offset -8)
	enter	8

#line	8
	' Write
	pushi	1
	pushi	0
	pushi	0
	call	f
	outi
	' Write
	pushb	10
	outb

#line	9
	' Write
	pushi	1
	pushi	0
	pushi	1
	call	f
	outi
	' Write
	pushb	10
	outb

#line	10
	' Write
	pushi	0
	pushi	1
	pushi	1
	call	f
	outi
	' Write
	pushb	10
	outb

#line	11
	' Write
	pushi	0
	pushi	0
	pushi	0
	call	f
	outi
	' Write
	pushb	10
	outb

#line	13
	push	bp
	pushi	-2
	addi
	pushi	1
	storei

#line	14
	push	bp
	pushi	-4
	addi
	pushi	3
	pushi	1
	gti
	storei

#line	15
	push	bp
	pushi	-6
	addi
	pushf	4.5
	pushf	4.2
	lef
	storei

#line	16
	' Write
	push	bp
	pushi	-2
	addi
	loadi
	outi
	' Write
	pushb	10
	outb

#line	17
	' Write
	push	bp
	pushi	-4
	addi
	loadi
	outi
	' Write
	pushb	10
	outb

#line	18
	' Write
	push	bp
	pushi	-6
	addi
	loadi
	outi
	' Write
	pushb	10
	outb

#line	20
	' If statement
	push	bp
	pushi	-2
	addi
	loadi
	jz	label0
	' Body of the if branch

#line	21
	' Write
	pushb	89
	outb
	' Write
	pushb	10
	outb
	jmp	label1
label0:
	' Body of the else branch

#line	23
	' Write
	pushb	78
	outb
	' Write
	pushb	10
	outb
label1:

#line	26
	push	bp
	pushi	-8
	addi
	pushi	0
	storei

#line	28
	' While statement
label2:
	push	bp
	pushi	-8
	addi
	loadi
	pushi	10
	lti
	jz	label3
	' Body of the while statement

#line	29
	' Write
	push	bp
	pushi	-8
	addi
	loadi
	outi
	' Write
	pushb	10
	outb

#line	30
	push	bp
	pushi	-8
	addi
	push	bp
	pushi	-8
	addi
	loadi
	pushi	1
	addi
	storei
	jmp	label2
label3:
	ret	0, 8, 0
