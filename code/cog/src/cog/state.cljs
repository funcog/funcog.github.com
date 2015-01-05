(ns cog.state)

(def v [1 2 3])
(defn cogn [] (reduce + (map inc v)))
(def cog (str "is " (cogn) "s"))
