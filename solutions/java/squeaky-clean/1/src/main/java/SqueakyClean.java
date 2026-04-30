class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder cleaned = new StringBuilder();

        for(int i=0;i<identifier.length();i++){
            char c = identifier.charAt(i); 

            if (c == '-') {
                if (i + 1 < identifier.length()) {
                    cleaned.append(Character.toUpperCase(identifier.charAt(i + 1)));
                    i++; 
                }
                continue;
            }

            if (c == ' ') {
                cleaned.append('_');
            } else if (c == '4') {
                cleaned.append('a');
            } else if (c == '3') {
                cleaned.append('e');
            } else if (c == '0') {
                cleaned.append('o');
            } else if (c == '1') {
                cleaned.append('l');
            } else if (c == '7') {
                cleaned.append('t');
            } else if (Character.isLetter(c)) {
                cleaned.append(c);
            }
        }
        return cleaned.toString();
    }
}
