(ns first.Sequences)

(defn Seq
  []
  (def colors (seq ["red" "green" "blue"]))
  (println colors)

  ;appends elements into sequences
  ;(cons element sequence)
  (println (cons "yellow" colors))
  ;cuando ingresamos un string en sequence se crea una lista
  ;con los caracteres separados del string (y e l l o w)
  ;(cons [5 9] [8 6 4 2]) = ([5 9] 8 6 4 2)
  (println (cons colors "yellow" ))

  ;(conj colors "yellow") = (yellow red green blue)
  (println (conj colors "yellow"))

  (println (conj ["red" "green" "blue"]  "yellow"))

  (println (conj (seq ["red" "green" "blue"])  "yellow"))

  (println (concat colors (seq ["white" "black"])))

  (println (distinct (seq [1 2 3 5 3 5 2 4])))

  (println (reverse colors))

  (println (first colors))
  (println (rest colors))
  (println (last colors))

  (println (sort (seq [1 2 3 5 3 5 2 4])))



  )
(Seq)