
#source	"lvalue.xana"


' Invocation to the main function
call main
halt


#line	1

f:
	' Parameters
	' e :: int (offset 4)
	' Local variables
	enter	0

#line	2
	' Return
	push	bp
	pushi	4
	addi
	loadi
	i2f
	ret	4, 0, 2

#line	5

main:
	' Parameters
	' Local variables
	' i :: int (offset -2)
	' a :: int (offset -4)
	' j :: int (offset -6)
	' v :: [10 :: double] (offset -46)
	enter	46

#line	9
	push	bp
	pushi	-4
	addi
	pushi	0
	storei

#line	10
	push	bp
	pushi	-2
	addi
	pushi	0
	storei

#line	11
	push	bp
	pushi	-6
	addi
	push	bp
	pushi	-2
	addi
	loadi
	subi
	push	bp
	pushi	-4
	addi
	loadi
	muli
	pushi	2
	subi
	storei

#line	13
	push	bp
	pushi	-46
	addi
	push	bp
	pushi	-46
	addi
	push	bp
	pushi	-6
	addi
	loadi
	pushi	4
	muli
	addi
	loadf
	f2i
	pushi	4
	muli
	addi
	push	bp
	pushi	-4
	addi
	loadi
	i2f
	storef

#line	15
	' Write
	pushb	102
	outb
	' Write
	pushb	40
	outb
	' Write
	pushb	105
	outb
	' Write
	pushb	41
	outb
	' Write
	pushb	61
	outb
	' Write
	push	bp
	pushi	-2
	addi
	loadi
	call	f
	outi
	ret	0, 46, 0
