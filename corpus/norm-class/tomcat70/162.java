licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache tomcat jni java nio byte buffer bytebuffer shm author mladen turk shm create accessible shared memory segment not e note anonymous name d named shared memory segments platforms support anonymous shared memory segments cases preferred types shared memory implementations passing file parameter function sub system subsystem anonymous shared memory segments system apr enotimpl returned not e note allocation sizes platforms store meta information metainformation segment actual segment order supply caller requested size implementation request greater segment length sub system subsystem cases apr shm base add r baseaddr function usable memory param req size reqsize desired size segment param filename file shared memory platforms require param pool pool all ocate allocate shared memory structure created shared memory structure create req size reqsize string filename pool error remove shared memory segment filename function supported platforms support based shared memory segments apr enotimpl platforms support param filename filename shared memory segment removed param pool pool file operations remove string filename pool destroy shared memory segment memory param shared memory segment structure destroy destroy attach shared memory segment created process param filename file create original segment match original filename param pool pool all ocate allocate shared memory structure process created shared memory structure attach string filename pool error detach shared memory segment dest roying destroying param shared memory structure representing segment detach detach retrieve base address shared memory segment note address usable callers address space api guarantee attaching processes main tain maintain address mapping param shared memory segment retrieve base address address aligned apr align base add r baseaddr retrieve length shared memory segment bytes param shared memory segment retrieve segment length size retrieve byte buffer bytebuffer base address shared memory segment note address usable callers address space api guarantee attaching processes main tain maintain address mapping param shared memory segment retrieve base address address aligned apr align byte buffer bytebuffer buffer