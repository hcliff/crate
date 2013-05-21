(ns crate.compiler)

(defn add-optional-attrs
  "Add an optional attribute argument to a function that returns a vector tag."
  [func]
  (fn [& args]
    (if (map? (first args))
      (let [result (apply func (rest args))]
        (update-in result [1] merge (first args)))
      (apply func args))))
