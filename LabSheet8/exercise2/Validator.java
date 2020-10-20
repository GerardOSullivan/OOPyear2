package LabSheet8.exercise2;

public class Validator {

    public static boolean isValidRegistrationNumber(String registrationNumber)
    {
        int i=0;

        if(registrationNumber.length()>=6 && registrationNumber.length()<=12)
        {
            if(Character.isDigit(registrationNumber.charAt(0)) && Character.isDigit(registrationNumber.charAt(1)))
            {
                if(registrationNumber.charAt(2)=='-')
                {
                    if(Character.isUpperCase(registrationNumber.charAt(3)) && Character.isLetter(registrationNumber.charAt(3)) &&
                            Character.isUpperCase(registrationNumber.charAt(4)) && Character.isLetter(registrationNumber.charAt(4)) && registrationNumber.charAt(5)=='-')
                    {
                        for(i=6;i<=registrationNumber.length()-1;i++)
                        {
                            if(!Character.isDigit(registrationNumber.charAt(i)))
                            {
                                break;
                            }
                        }

                        if(i==registrationNumber.length())
                        {
                            return true;
                        }
                        else
                        {
                            return false;
                        }


                    }
                    else
                    {
                        if(Character.isUpperCase(registrationNumber.charAt(3)) && Character.isLetter(registrationNumber.charAt(3)) && registrationNumber.charAt(4)=='-')
                        {
                            for(i=5;i<=registrationNumber.length()-1;i++)
                            {
                                if(!Character.isDigit(registrationNumber.charAt(i)))
                                {
                                    break;
                                }
                            }

                            if(i==registrationNumber.length())
                            {
                                return true;
                            }
                            else
                            {
                                return false;
                            }
                        }
                        else
                        {
                            return false;
                        }
                    }

                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
