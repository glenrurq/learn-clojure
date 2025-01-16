(ns learn-clojure.core)

(def l '(1.1 24632.3 2357489 1235.32 345))
(def vectorA [3217 167 2672 72391 543 6 3 828])
(def mapB {:a 1 :b 2})
(def v (vector 2.3 567 542.3 36248.7))
(conj vectorA 6528743);;This function ads a new element at the end of the vector
(conj l 563);;This function ads a new element at the end of the list
(cons 237 vectorA);;This function ads an element at the begin of any colection
(cons [:c 1] mapB)
(pop vectorA)
(-> vectorA
    butlast
    last)
(def vectorB (conj vectorA 12))
(first vectorA)
(first vectorB)
(second vectorB)
(last vectorA)
(last vectorB)
(-> vectorB
    butlast
    last)
(rest vectorA)
(rest l)
(-> l
    rest
    first)
(second l)
(nth vectorB 6)
(count vectorB)
(nth vectorB 9 0)
(count vectorA)
(vector? l)
(vector? vectorA)
(list? l)
(list? vectorB)

(def band {:type :smart_watch
           :device_name "Xiaomi Smart Band 9"
           :model "M2345B1"
           :manufacturer "Xiaomi Comunications Co.,Ltd."
           :mac_adress "0816D5B0E9DF"
           :system {:operative_system "Xiaomi HyperOs"
                    :version "2.3.93"}
           :serial_number "55453/DYAMJQ4WQ14805"
           :power {:voltage 5.0
                   :milliamps 500
                   :current "DC"}})






