copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt core util description opcode mnemonic jvm specifications noimplement intended implemented clients i opcode mnemonics iopcodemnemonics nop aconst iconst iconst iconst iconst iconst iconst iconst lconst lconst fconst fconst fconst dconst dconst bipush sipush ldc ldc ldc iload lload fload dload aload iload iload iload iload lload lload lload lload fload fload fload fload dload dload dload dload aload aload aload aload iaload laload faload daload aaload baload caload saload istore lstore fstore dstore ast ore astore istore istore istore istore lstore lstore lstore lstore fstore fstore fstore fstore dstore dstore dstore dstore ast ore astore ast ore astore ast ore astore ast ore astore iastore last ore lastore fastore dastore aastore bastore cast ore castore sastore pop pop dup dup dup dup dup dup swap iadd ladd fadd dadd isub lsub fsub dsub imul lmul fmul dmul idiv ldiv fdiv ddiv irem lrem frem drem ineg lneg fneg dneg ishl lshl ishr lshr iushr lushr iand land ior lor ixor lxor iinc lcmp fcmpl fcmpg dcmpl dcmpg ifeq ifne iflt ifge ifgt ifle icmpeq icmpne icmplt icmpge icmpgt icmple acmpeq acmpne jsr ret table switch tableswitch xaa lookupswitch xab ireturn xac lreturn xad freturn xae dreturn xaf are turn areturn get static getstatic put static putstatic get field getfield put field putfield invoke virtual invokevirtual invoke special invokespecial invoke static invokestatic invoke interface invokeinterface invoke dynamic invokedynamic xba xbb new array newarray xbc anewarray xbd array length arraylength xbe athrow xbf check cast checkcast monitor enter monitorenter monitor exit monitorexit wide multianewarray ifnull ifnonnull jsr breakpoint xca impdep xfe impdep xff