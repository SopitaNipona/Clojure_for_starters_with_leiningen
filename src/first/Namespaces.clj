(ns first.Namespaces
  (:require [clojure.string]))

(defn -main
  []
  (println (clojure.string/capitalize "hello"))
  )

(-main)