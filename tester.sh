declare -i total=0
declare -i incorrect=0

red=`tput setaf 1`
green=`tput setaf 2`
reset=`tput sgr0`

for i in id_cases/*_ac.java; do
    [ -f "$i" ] || break
    let "total=total+1"
    echo "========$i========"
    java miniJava.Compiler $i
    if [ "$?" -ne 0 ]; then
        echo "${red} $i not passed: $? ${reset}"
        let "incorrect=incorrect+1"
    fi
    # echo "================="
done

for i in id_cases/*_wa.java; do
    [ -f "$i" ] || break
    let "total=total+1"
    echo "=======$i========"
    java miniJava.Compiler $i
    if [ "$?" = 0 ]; then
        echo "${red} $i not passed: $? ${reset}"
        let "incorrect=incorrect+1"
    fi
    # echo "================="
done

echo "Failed Tests: $incorrect, Total $total"