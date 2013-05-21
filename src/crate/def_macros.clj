(ns crate.def-macros)

(defmacro defelem
  "Defines a function that will return a tag vector. If the first argument
  passed to the resulting function is a map, it merges it with the attribute
  map of the returned tag value."
  [name & fdecl]
  `(do
    (declare ~name)
    (let [func# (fn ~@fdecl)]
      (def ~name (crate.compiler/add-optional-attrs func#)))))