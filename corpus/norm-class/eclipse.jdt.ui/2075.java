copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal corext dom org eclipse core runtime org eclipse jface text i region iregion org eclipse jdt core dom ast node astnode selection flag indicating ast node int ersects intersects selection intersects flag ast node appears selected nodes flag indicating ast node covered selection selected flag indicating ast nodes appears selected nodes f start fstart f length flength f exclusive end fexclusiveend selection creates selection start length param start offset selection inclusive param length selection created selection object selection create from start length createfromstartlength is true istrue selection result selection result f start fstart result f length flength result f exclusive end fexclusiveend result creates selection start param start offset selection inclusive param offset selection inclusive created selection object selection create from start end createfromstartend is true istrue selection result selection result f start fstart result f length flength result f exclusive end fexclusiveend result f start fstart result f length flength result get offset getoffset f start fstart get length getlength f length flength get inclusive end getinclusiveend f exclusive end fexclusiveend get exclusive end getexclusiveend f exclusive end fexclusiveend returns selection mode ast node selection values code intersects code code code code selected code code code param node node visit mode selection mode ast node selection intersects selected get visit selection mode getvisitselectionmode ast node astnode node node start nodestart node get start position getstartposition node end nodeend node start nodestart node get length getlength node end nodeend f start fstart covers node selected f exclusive end fexclusiveend node start nodestart intersects get end visit selection mode getendvisitselectionmode ast node astnode node node start nodestart node get start position getstartposition node end nodeend node start nodestart node get length getlength node end nodeend f start fstart covers node selected node end nodeend f exclusive end fexclusiveend intersects cover methods closed int erval interval check covers position f start fstart position position f start fstart f length flength covers ast node astnode node node start nodestart node get start position getstartposition f start fstart node start nodestart node start nodestart node get length getlength f exclusive end fexclusiveend covered by coveredby ast node astnode node node start nodestart node get start position getstartposition node start nodestart f start fstart f exclusive end fexclusiveend node start nodestart node get length getlength covered by coveredby i region iregion region range start rangestart region get offset getoffset range start rangestart f start fstart f exclusive end fexclusiveend range start rangestart region get length getlength ends in endsin ast node astnode node node start nodestart node get start position getstartposition node start nodestart f exclusive end fexclusiveend f exclusive end fexclusiveend node start nodestart node get length getlength lies out side liesoutside ast node astnode node node start nodestart node get start position getstartposition node end nodeend node start nodestart node get length getlength node before selection nodebeforeselection node end nodeend f start fstart selection before node selectionbeforenode f exclusive end fexclusiveend node start nodestart node before selection nodebeforeselection selection before node selectionbeforenode override string to string tostring nls nls nls start f start fstart length f length flength