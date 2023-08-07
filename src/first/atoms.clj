(ns first.atoms)

(defn Atoms []
  (def amount (atom 100))
  (println @amount)

  ;cambia el atom evitando que el resto de los threads lo cambie
  (swap! amount inc)
  (println @amount)

  ;Cambia el valor del atom
  (reset! amount 110)
  (println @amount)

  ;(compare-and-set! valorAtom valorAEncontrar valorRemplazo)
  (compare-and-set! amount 110 120)
  (println @amount)
  )
(Atoms)