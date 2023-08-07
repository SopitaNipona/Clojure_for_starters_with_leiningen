(ns first.dealership)

(def statusBoolCode false)

(defn discount
  [x]
  (def codes [12345 54123 78945 10101 88888])
  ;algoritmo lineal de busqueda O(N)
  (doseq
    [y codes]
    (if (= x y) (def statusBoolCode true) )
    )
  (if (= statusBoolCode true) (println "Codigo Valido") (println "Codigo Invalido"))
  )

(defn carsPrices
  [x]
  (def prices (seq [60000 100000 20000] ))
  (nth prices (- x 1))
  )

(defn purchase
  [discCode selectedCar]
  (discount discCode)
  (if (= statusBoolCode true)
    (def price (- (carsPrices selectedCar) (* (carsPrices selectedCar) 0.20)))
    (def price (carsPrices selectedCar)))
  )

(defn start
  []
  (println "Bienvenido a la consecionaria SUPER COCHES")
  (println "selecione un modelo: \n 1: BMV \n 2: Ferrari \n 3: Fiat \n")
  (def selected (Integer/parseInt (read-line)))
  (println "Ingrese su codigo de descuento")
  (def disc (Integer/parseInt (read-line)))
  (purchase disc selected)
  (println price)
  )



(start)