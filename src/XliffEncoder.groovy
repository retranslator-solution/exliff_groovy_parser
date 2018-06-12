import entity.XliffArray
import entity.XliffEntity
import entity.XliffPlurals
import entity.XliffString
import exceptions.UnsupportedTypeException

class XliffEncoder {

    String toFile(List<XliffEntity> entities){
        StringBuilder xmlBuilder = StringBuilder
        for(XliffEntity entity: entities){
            if(entity instanceof XliffString){
                xmlBuilder.append(parseFromXliffString(entity as XliffString))
            }else if (entity instanceof XliffPlurals){
                xmlBuilder.append(parseFromXliffPlurals(entity as XliffPlurals))
            }else if (entity instanceof XliffArray){
                xmlBuilder.append(parseFromXliffArray(entity as XliffArray))
            }else {
                throw UnsupportedTypeException
            }
        }
    }

    String parseFromXliffString(XliffString exliffString){

    }

    String parseFromXliffPlurals(XliffPlurals exliffPlurals){

    }

    String parseFromXliffArray(XliffArray exliffArray){

    }
}
