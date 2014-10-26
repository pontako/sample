syntax on

set number
set hlsearch
set ruler

colorscheme desert

" タブ幅
set softtabstop=4
set expandtab
" タブを表示するときの幅
set tabstop=4
" タブを挿入するときの幅
set shiftwidth=2
" タブの視覚化
highlight TagKey guibg=#b5d68f
match TagKey /	/

" IgnoreCase For Search
set ic
" Incremental Search
set incsearch

" netrwは常にtree view
"let g:netrw_liststyle = 3
" CVSと.で始まるファイルは表示しない
" let g:netrw_list_hide = 'CVS,\(^\|\s\s\)\zs\.\S\+'
" 'v'でファイルを開くときは右側に開く。(デフォルトが左側なので入れ替え)
let g:netrw_altv = 1
" 'o'でファイルを開くときは下側に開く。(デフォルトが上側なので入れ替え)
let g:netrw_alto = 1

set cursorline
"highlight CursorLine ctermbg=Black
"highlight CursorLine ctermfg=Blue

"set cursorcolumn
"highlight CursorColumn ctermbg=Blue
"highlight CursorColumn ctermfg=Green

":set encoding=utf-8
":set fileencodings=iso-2022-jp,euc-jp,sjis,utf-8
":set fileformats=unix,dos,mac

if &term =~ "screen"
"  autocmd BufEnter * if bufname("") !~ "^\[A-Za-z0-9\]*://" | silent!  exe '!echo -n "kvi[%]\\    "' | endif
  autocmd BufEnter * if bufname("") !~ "^\[A-Za-z0-9\]*://" | silent! exe '!echo -n "kvi[%]\\"' | endif
  autocmd VimLeave * silent!  exe '!echo -n "k[/`basename $PWD`]\\"'
endif

let java_highlight_all=1
let java_highlight_functions="style"
let java_allow_cpp_keywords=1

set sm
set ai

set tags=~/.vim/tags/jdk1.6_tags
set complete=.,w,b,u,t,i
