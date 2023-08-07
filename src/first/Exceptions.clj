(ns first.Exceptions)

(defn ExHandling
  [x]
  (try (inc x)
       (catch ClassCastException e (println "not a number: " (.getMessage e)))
       (catch Exception e (println "Caught generic exception"))
       (finally (println "Cleanup and move on"))
       )
  (println x)
  )

(ExHandling "not a number")