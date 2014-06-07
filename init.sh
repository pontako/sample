#!/bin/sh

# GNU screen 用のコマンド。引数を screen のステータス行に表示。
function dispstatus { 
#    if [[ "$STY" ]]; then echo -en "\033k$1\033\134"; fi 
    if [[ "$STY" ]]; then echo -en "\033k$1\033\\"; fi 
#    echo -en "\033k$1\033\\" 
}

function prompt_command {
#    dispstatus "${PWD}" 
    dispstatus "/$(basename $PWD)" 
}

PROMPT_COMMAND=prompt_command

_termtitle="\h:\w"
PS1="\[\e]0;${_termtitle}\007\]${PS1}"

# Set mintty theme color
#source ~/.mintty/mintty-solarized-light.sh
source ~/.mintty/mintty-solarized-dark.sh

if [ $SHLVL = 1 ];then
#echo -ne '\e]0;terminal\a'
echo -ne '\e]0;\a'
screen
fi
