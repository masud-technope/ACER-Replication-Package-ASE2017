copyright ibm corporation rights reserved program accompanying materials terms common license accompanies distribution http eclipse org legal cpl html contributors ibm corporation initial api implementation org eclipse jdt internal compiler util internal utility decl aing declaing hexadecimal literals float util floatutil fraction width precision max exponent min normalized exponent min unnormalized exponent min normalized exponent precision exponent bias exponent shift single fraction width single precision max single exponent min normalized single exponent min unnormalized single exponent min normalized single exponent single precision single exponent bias single exponent shift returns hexadecimal floating point single precision literal literal syntactially correct literal include leading trailing whitespace sign method returns answer parse float parsefloat string source jdk method returns floal na n nan under flow underflow parse float parsefloat returns method handles tricky cases including fraction rounding bits gradual under flow underflow param source source string single precision hexadecimal floating point literal including positive infinity large represented na n nan small represented value of hex float literal valueofhexfloatliteral source bits convert hex floating point literal to bits converthexfloatingpointliteraltobits source int bits to float intbitstofloat bits returns hexadecimal floating point precision literal literal syntactially correct literal optional include leading trailing whitespace sign method returns answer parse double parsedouble string source jdk method number format exception numberformatexception overflow infinity under flow underflow method handles tricky cases including fraction rounding bits gradual under flow underflow param source source string precision hexadecimal floating point literal including positive infinity large represented na n nan small represented value of hex double literal valueofhexdoubleliteral source bits convert hex floating point literal to bits converthexfloatingpointliteraltobits source long bits to double longbitstodouble bits returns hexadecimal floating point literal bits single precision precision ieee floating point number literal syntactially correct include leading trailing whitespace sign param source source string hexadecimal floating point literal precision literals bits suitable passing long bits to double longbitstodouble single precision literals bits suitable passing single int bits to double intbitstodouble bottom bits result number format exception numberformatexception number parsed convert hex floating point literal to bits converthexfloatingpointliteraltobits source length source length mantissa step process lead next char nextchar source next char nextchar source next char nextchar number format exception numberformatexception next char nextchar source next char nextchar next char nextchar number format exception numberformatexception step process leading binary point position binarypointposition loop next char nextchar source next char nextchar loop binary point position binarypointposition loop loop step process mantissa leading zeros trimmed mantissa bits mantissabits leading digit position leadingdigitposition loop next char nextchar source hexdigit next char nextchar hexdigit next char nextchar hexdigit next char nextchar hexdigit next char nextchar binary point position binarypointposition loop binary point position binarypointposition record virtual digits binary point position binarypointposition loop mantissa bits mantissabits hex digit ignore leading binary hex digit leading digit position leadingdigitposition mantissa hexdigit mantissa bits mantissabits mantissa bits mantissabits middle hex digits mantissa mantissa hexdigit mantissa bits mantissabits mantissa bits handle drop hex digit ground loop step process next char nextchar source next char nextchar next char nextchar number format exception numberformatexception step process exponent exponent exponent sign exponentsign loop length next char nextchar source next char nextchar exponent sign exponentsign loop exponent sign exponentsign loop digit next char nextchar exponent exponent digit loop loop step process optional double precision doubleprecision length next char nextchar source next char nextchar double precision doubleprecision double precision doubleprecision number format exception numberformatexception step handle mantissa mantissa step normalize mantissa mantissa hand mantissa bits mantissabits ensure top bit opposed hex digit scale factor compensation scalefactorcompensation top mantissa mantissa bits mantissabits top mantissa bits mantissabits scale factor compensation scalefactorcompensation top mantissa bits mantissabits scale factor compensation scalefactorcompensation top mantissa bits mantissabits scale factor compensation scalefactorcompensation step convert literals ieee result double precision doubleprecision fraction mantissa bits mantissabits precision bits extra bits extrabits mantissa bits mantissabits precision precision bits fraction mantissa extra bits extrabits low bit lowbit fraction fraction low bit lowbit fraction fraction fraction precision fraction fraction scale factor compensation scalefactorcompensation bits fact ion faction hold pad fraction mantissa precision mantissa bits mantissabits bits move leading hex digit scale factor scalefactor mantissa bits mantissabits leading digit position leadingdigitposition binary point position binarypointposition scale factor scalefactor scale factor scalefactor binary point position binarypointposition leading digit position leadingdigitposition scale factor compensation scalefactorcompensation scale factor scalefactor scale factor compensation scalefactorcompensation scale factor scalefactor scale factor scalefactor leading digit position leadingdigitposition binary point position binarypointposition scale factor compensation scalefactorcompensation scale factor scalefactor scale factor compensation scalefactorcompensation exponent sign exponentsign exponent scale factor scalefactor max exponent overflow infinity result double to long bits doubletolongbits positive infinity min normalized exponent represented normalized left bit discarded biased exponent biasedexponent exponent bias result fraction fraction width result biased exponent biasedexponent exponent shift min unnormalized exponent represented unnormalized biased exponent biasedexponent result fraction min normalized exponent result biased exponent biasedexponent exponent shift under flow underflow na n nan result double to long bits doubletolongbits na n nan result step convert literals ieee single fraction mantissa bits mantissabits single precision bits extra bits extrabits mantissa bits mantissabits single precision precision bits fraction mantissa extra bits extrabits low bit lowbit fraction fraction low bit lowbit fraction fraction fraction single precision fraction fraction scale factor compensation scalefactorcompensation bits fact ion faction hold pad fraction mantissa single precision mantissa bits mantissabits bits move leading hex digit scale factor scalefactor mantissa bits mantissabits leading digit position leadingdigitposition binary point position binarypointposition scale factor scalefactor scale factor scalefactor binary point position binarypointposition leading digit position leadingdigitposition scale factor compensation scalefactorcompensation scale factor scalefactor scale factor compensation scalefactorcompensation scale factor scalefactor scale factor scalefactor leading digit position leadingdigitposition binary point position binarypointposition scale factor compensation scalefactorcompensation scale factor scalefactor scale factor compensation scalefactorcompensation exponent sign exponentsign exponent scale factor scalefactor max single exponent overflow infinity result float to int bits floattointbits positive infinity min normalized single exponent represented normalized single left bit discarded biased exponent biasedexponent single exponent bias result fraction single fraction width result biased exponent biasedexponent single exponent shift min unnormalized single exponent represented unnormalized single biased exponent biasedexponent result fraction min normalized single exponent result biased exponent biasedexponent single exponent shift under flow underflow na n nan result float to int bits floattointbits na n nan result