for i in id_cases/*_ac.java; do
    [ -f "$i" ] || break
    echo "========$i========"
    java miniJava.Compiler $i
    if [ "$?" -ne 0 ]; then
        echo "$i not passed: $?"
    fi
    echo "================="
done

for i in id_cases/*_wa.java; do
    [ -f "$i" ] || break
    echo "=======$i========"
    java miniJava.Compiler $i
    if [ "$?" = 0 ]; then
        echo "$i not passed: $?"
    fi
    echo "================="
done