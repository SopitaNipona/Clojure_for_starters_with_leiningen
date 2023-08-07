(ns first.functions
  (:gen-class))
(defn -main
  ;My first function
  [x]
  (+ x 5))

;Anonnymous function

#(println "Hello" %)

;las funciones son valores

; defn crea una funcion, def asigna una funcion o variable un nombre


(def increment (fn [x] (+ x 1)))

(defn increment_set
  [x]
  ;map retorna el valor de la funcion de multiples entradas

  (map increment x))


;Para utilizar las funciones en REPL se debe de escribir
;(in-ns 'nombreproyecto.nombredelarchivo)

(defn DataTypes
  []
  (def a 1)
  (println a)
  )

(DataTypes)

; los maps se escriben por medio de (def nombreMapa{'key "value", 'key2 "value2"})
; para sacar un valor de un mapa se necesita
; los sets se escriben #{contenido} sin comas
; Los vectores se escriben con []

(defn humanAge [x, y]
  (if (= y " dog ") (* x 7) (if (= y " cat ") (* x 5) (if (= y " fish ") (* x 10) (println " Invalid choice "))))
  )

; para conseguir un valor almacenado en un mapa, utilizamos get
;(get nombreMapa keyword)

(defn humanAgeMap [x]
  (def ages {'cat 5, 'dog 7, 'fish 10})
  (get ages x))

(defn petAge
  [type, age]
  (def ratio (humanAgeMap type))
  (* ratio age)
  )
 (println (petAge 'dog 10))

; "do" nos permite hacer multiples acciones dentro de una condicional if

(defn condIfDo
  [x]
  (if (= 5 x) (do (println "Es igual a 5")
              (println "Primera opcion"))
    (do (println "No es igual a 5")
        (println "Segunda opcion")  ))

  )

(defn condCase
  [x]
  (case x
    "dog" (println "its a dog :D")
    "cat" (println "its a cat :D")
    )
  )

(defn condCond
  [x]
  (cond
    (= x 5) (println "Es igual a 5")
    (>= x 5) (println "es mayor a 5")
    (<= x 5) (println "Es menor a 5")
            :else (println "IDK")
            ))

(condCond 5)