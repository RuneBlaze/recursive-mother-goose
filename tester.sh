red=`tput setaf 1`
green=`tput setaf 2`
reset=`tput sgr0`

for i in id_cases/*_ac.java; do
    [ -f "$i" ] || break
    echo "========$i========"
    java miniJava.Compiler $i
    if [ "$?" -ne 0 ]; then
        echo "${red} $i not passed: $? ${reset}"
    fi
    # echo "================="
done

for i in id_cases/*_wa.java; do
    [ -f "$i" ] || break
    echo "=======$i========"
    java miniJava.Compiler $i
    if [ "$?" = 0 ]; then
        echo "${red} $i not passed: $? ${reset}"
    fi
    # echo "================="
done