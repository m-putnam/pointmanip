(ns pointmanip.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

; Some trial points for testing
(def point1 [5,3])
(def point2 [11,5])

; Returns a vector of the values stored in p1 & p2 at requested addr
(defn vect_pair
  [p1 p2 addr]
  (vector (get p1 addr) (get p2 addr)))

; Takes two points, returns vector of their x-values
(defn dist_x
  [p1 p2]
  (-> (- (get p2 0) (get p1 0)) (Math/pow 2)))

; Same as pointx except it returns y-values
(defn dist_y
  [p1 p2]
  (-> (- (get p2 1) (get p1 1)) (Math/pow 2)))

; Getting into distance calculation
(defn dist_main
  [p1 p2]
  (Math/sqrt (+ (dist_x p1 p2) (dist_y p1 p2))))

;;Now for some midpoint functions
;(defn midpoint
;  [p1 p2]
;  (vector (map #(/ % 2) [(vect_pair p1 p2 0) (vect_pair p1 p2 1)])))

