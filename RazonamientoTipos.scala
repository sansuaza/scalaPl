type PersonaId = Int
//typo de dato persona es un int

case class Persona(id: PersonaId, nombre: String)
//el id ya es mucho mas caracterizado de que se trata

type Estudiante = Persona
// es un alias del tipo persona, y cuando se crea que de typo de datos de persona
