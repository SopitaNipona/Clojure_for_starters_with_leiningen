(ns first.loops
  (:gen-class))

(defn Loop []
  (println "\nloop:")
  (loop [x 0]
    (when (< x 10)
      (println x)
      (recur (inc x))
      )
    )
  )

(defn DoTimes []
  (println "\nlDoTimes")
  (dotimes [x 10]
    (println x))
  )

(defn WhileDo [count]
  (println "\nWhileDo")
  (def x (atom 0))
  (while (< @x count)
    (do
      (println @x)
      (swap! x inc)
      )
    )
  )

(defn DoSeq
  [seq]
  (println "\nDoSeq")
  (doseq [x seq]
    (println (inc x))
    )
  )

(Loop)
(DoTimes)
(WhileDo 10)
(DoSeq [6 3 5 9 4])

